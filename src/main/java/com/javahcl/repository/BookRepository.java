package com.javahcl.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.javahcl.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	public List<Book> findByUuid(int uuid, Pageable pageable);
	public List<Book> findByTitle(String title, Pageable pageable);
	public List<Book> findByAuthorName(String authorName, Pageable pageable);
	public List<Book> findByCategory(String category, Pageable pageable);
	
	
	
}
