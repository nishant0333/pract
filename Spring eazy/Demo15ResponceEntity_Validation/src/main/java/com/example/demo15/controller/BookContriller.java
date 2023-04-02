package com.example.demo15.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo15.model.Book;
import com.example.demo15.service.BookService;

@RestController
@RequestMapping("/book")
public class BookContriller {

	@Autowired
	BookService bookService;

	@PostMapping
	public Book saveBook(@RequestBody Book book) {
		bookService.saveBook(book);
		return book;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Book> getSingleBook(@PathVariable int id) {

		Book book = bookService.getSingleBook(id);

		if (book == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(book));
	}

	@GetMapping
	public ResponseEntity<List<Book>> getAllBook() {

		List<Book> allBook = bookService.getAllBook();
		if ((allBook.size()) <= 0) {

			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(allBook));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable int id) {

		bookService.deleteBook(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}
