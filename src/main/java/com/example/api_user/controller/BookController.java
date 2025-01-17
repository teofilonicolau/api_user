package com.example.api_user.controller;

import com.example.api_user.model.Book;
import com.example.api_user.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> listarTodos() {
        return bookService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Book> buscarPorId(@PathVariable Long id){
        return bookService.buscarPorId(id);
    }

    @PostMapping
    public Book salvar(@RequestBody Book book) {
        return bookService.salvar(book);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id) {
        bookService.deletarPorId(id);
    }
}
