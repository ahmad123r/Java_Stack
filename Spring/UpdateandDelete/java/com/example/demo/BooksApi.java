package com.example.demo;


import com.example.demo.model.Book;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.BookService;
@Controller
@SpringBootApplication
public class BooksApi {
 private final BookService bookService;
 public BooksApi(BookService bookService){
     this.bookService = bookService;
 }
 @RequestMapping("/{id}")
	public String x1(@PathVariable("id") Long id,HttpSession session) {
	 Book book = bookService.findBook(id);
	 session.setAttribute("book", book);
		return "Show.jsp";
	}
 @RequestMapping("/api/books")
 public List<Book> index() {
     return bookService.allBooks();
 }
 
 @RequestMapping(value="/api/books", method=RequestMethod.POST)
 public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
     Book book = new Book(title, desc, lang, numOfPages);
     return bookService.createBook(book);
 }
 
 @RequestMapping("/api/books/{id}")
 public Book show(@PathVariable("id") Long id) {
     Book book = bookService.findBook(id);

     return book;
 }
 @RequestMapping(value = "/api/books/{id}", method = RequestMethod.PUT)
 public Book update(@PathVariable("id") Long id, @RequestParam(value = "title") String title,
         @RequestParam(value = "description") String desc, @RequestParam(value = "language") String lang,
         @RequestParam(value = "pages") Integer numOfPages) {
	 System.out.println("hdgjsdogjsding");
     Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
     return book;
 }
 @RequestMapping(value="/books/{id}", method=RequestMethod.DELETE)
 public void destroy(@PathVariable("id") Long id) {
     bookService.deleteBook(id);
 }
}
