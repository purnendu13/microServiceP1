package com.example.M2Book;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	@Autowired
	private BookRepo bookRepo;
	//add
	public Book add(Book book) {
		return bookRepo.save(book);
	}
	//getAll
	public List<Book> getAll(){
		return bookRepo.findAll();
	}
	//update
	public Book updete(int id, Book book) {
		Optional<Book> existingBook=bookRepo.findById(id);
		if(existingBook.isPresent()) {
			book.setId(id);
			return bookRepo.save(book);
		}
		else
		return null;
		
	}
	
	//delete
	public String delete(int id) {
		bookRepo.deleteById(id);
		return "id deleted "+id;
	}
}
