package com.example.api_user.service;

import com.example.api_user.model.Author;
import com.example.api_user.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> listarTodos() {
        return authorRepository.findAll();
    }

    public Optional<Author> buscarPorId(Long id) {
        return authorRepository.findById(id);
    }

    public Author salvar(Author author) {
        return authorRepository.save(author);
    }

    public void deletarPorId(Long id) {
        authorRepository.deleteById(id);
    }
}
