package gr.controller;

import gr.model.Book;
import gr.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks(Authentication authentication) {

        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id, Authentication authentication) {

        Book book = bookService.getBookById(id);
        return ResponseEntity.ok(book);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book, Authentication authentication) {
        return bookService.createBook(book);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book bookDetails, Authentication authentication) {
        Book updatedBook = bookService.updateBook(id, bookDetails);
        return ResponseEntity.ok(updatedBook);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id, Authentication authentication) {
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
}