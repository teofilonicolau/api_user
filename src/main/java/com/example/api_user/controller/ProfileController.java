package com.example.api_user.controller;

import com.example.api_user.model.Profile;
import com.example.api_user.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profiles")
public class ProfileController {
    @Autowired
    private ProfileService profileService;

    @GetMapping
    public List<Profile> listarTodos() {
        return profileService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Profile> buscarPorId(@PathVariable Long id){
        return profileService.buscarPorId(id);
    }

    @PostMapping
    public Profile salvar(@RequestBody Profile profile) {
        return profileService.salvar(profile);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id) {
        profileService.deletarPorId(id);
    }
}
