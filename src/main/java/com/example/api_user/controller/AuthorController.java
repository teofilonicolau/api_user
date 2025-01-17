package com.example.api_user.controller;

import com.example.api_user.model.Author;
import com.example.api_user.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> listarTodos() {
        return authorService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Author> buscarPorId(@PathVariable Long id){
        return authorService.buscarPorId(id);
    }

    @PostMapping
    public Author salvar(@RequestBody Author author) {
        return authorService.salvar(author);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id) {
        authorService.deletarPorId(id);
    }
}
