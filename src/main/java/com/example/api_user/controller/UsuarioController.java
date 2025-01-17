package com.example.api_user.controller;

import com.example.api_user.model.Usuario;
import com.example.api_user.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario criarUsuarioComPerfil(@RequestBody Usuario usuario) {
        return usuarioService.criarUsuarioComPerfil(usuario.getNome(), usuario.getProfile().getBio());
    }
}
