package com.example.M2Book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired 
	private BookService bookService;
	
	//get
	@GetMapping("/getAll")
	public List<Book> GetAllBooks(){
		return bookService.getAll();
	}
	
	//add
	@PostMapping("/add")
	public Book addBook(@RequestBody Book book) {
		return bookService.add(book);
	}
	//delete
	@DeleteMapping("/delete/{id}")
	public String DeleteBook(@PathVariable int  id) {
		return bookService.delete(id);
		
	}
	//update
	@PutMapping("/update/{id}")
	public Book updateBook(@RequestBody int id,Book book) {
		return bookService.updete(id, book);
	}
	
}
