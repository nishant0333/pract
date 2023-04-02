package com.example.demo15.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import com.example.demo15.annotation.NameValidator;

@Component
@Entity
@Table(name = "BOOK_RES")
public class Book {
	@Id
	private int id;
	@Column
	@NotBlank(message = "id must not be blank")
	@Size(min = 3,message = "name must be 3 character or grater")
	@NameValidator(message = "do not put nishat,Nishant")
	private String name;
	@Column
	@NotBlank(message = "id must not be blank")
	@Size(min = 3,message = "author must be 3 character or grater")
	private String author;
	@Column
	@NotNull
	private String price;
	
	
	public Book(int id, String name, String author, String price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}


	public Book() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}

	
}
