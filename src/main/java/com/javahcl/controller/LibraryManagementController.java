package com.javahcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javahcl.model.BookIO;
import com.javahcl.service.LibraryManagementService;

@RestController
public class LibraryManagementController {

	@Autowired
	LibraryManagementService service;

	@PostMapping("/findBook")
	private List<BookIO> findBook(@RequestBody BookIO request) {

		return service.findBook(request);

	}

}
