package com.example.demo15.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo15.model.Book;
import com.example.demo15.repo.BookRepo;



@Service
public class BookService {
	
	@Autowired
	BookRepo bookRepo;
	
	public void saveBook(Book book) {
		
		bookRepo.save(book);
	}
	
	public Book getSingleBook(int id) {
		
		Book book=null;
		try {
			 book = bookRepo.findById(id).get();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return book;
		}

	public List<Book> getAllBook(){
		List<Book> list=null;
		
		try {
			 list = bookRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void deleteBook(int id) {
		try {
			bookRepo.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
