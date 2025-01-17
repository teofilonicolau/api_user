package com.example.api_user.service;

import com.example.api_user.model.Book;
import com.example.api_user.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> listarTodos() {
        return bookRepository.findAll();
    }

    public Optional<Book> buscarPorId(Long id) {
        return bookRepository.findById(id);
    }

    public Book salvar(Book book) {
        return bookRepository.save(book);
    }

    public void deletarPorId(Long id) {
        bookRepository.deleteById(id);
    }
}
