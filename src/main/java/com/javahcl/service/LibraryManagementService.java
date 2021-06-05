package com.javahcl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.javahcl.entity.Book;
import com.javahcl.entity.BorrowHistory;
import com.javahcl.model.BookIO;
import com.javahcl.repository.BookRepository;
import com.javahcl.repository.BorrowHistoryRepository;

@Service
public class LibraryManagementService {
	@Autowired
	BookRepository bookRepository;

	@Autowired
	BorrowHistoryRepository borrowHistoryRepository;

	public List<BookIO> findBook(BookIO request) {
		List<Book> listOfBook = new ArrayList<>();
		Pageable sortedByTitle = PageRequest.of(request.getPageNumber(), request.getNumberOfData(), Sort.by("title"));
		if (request.getTitle() != null) {
			listOfBook = bookRepository.findByTitle(request.getTitle(), sortedByTitle);
		} else if (request.getAuthor() != null) {
			listOfBook = bookRepository.findByAuthorName(request.getAuthor(), sortedByTitle);
		} else if (request.getCategory() != null) {
			listOfBook = bookRepository.findByCategory(request.getCategory(), sortedByTitle);
		} else if (request.getUuid() != null) {
			listOfBook = bookRepository.findByUuid(Integer.valueOf(request.getUuid()), sortedByTitle);
		}
		List<BookIO> listOfData = new ArrayList<>();
		for (Book book : listOfBook) {
			BookIO bookIO = new BookIO();
			BorrowHistory borrwHistory = borrowHistoryRepository.findByUuId(book.getUuid());

			bookIO.setAuthor(book.getAuthorName());
			bookIO.setCategory(book.getCategory());
			bookIO.setReturnDueDate(borrwHistory.getReturnDate());
			bookIO.setStatus(borrwHistory.getStatus());
			bookIO.setTitle(book.getTitle());
			bookIO.setUuid(String.valueOf(book.getUuid()));
			listOfData.add(bookIO);

		}

		return listOfData;
	}

}
