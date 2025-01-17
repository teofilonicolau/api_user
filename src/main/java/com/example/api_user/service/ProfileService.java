package com.example.api_user.service;

import com.example.api_user.model.Profile;
import com.example.api_user.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    public List<Profile> listarTodos() {
        return profileRepository.findAll();
    }

    public Optional<Profile> buscarPorId(Long id) {
        return profileRepository.findById(id);
    }

    public Profile salvar(Profile profile) {
        return profileRepository.save(profile);
    }

    public void deletarPorId(Long id) {
        profileRepository.deleteById(id);
    }
}
