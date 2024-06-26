package com.restapi.crudproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.crudproject.model.User;
import com.restapi.crudproject.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/test")
    public String testConnection() {
        // Créez un nouvel utilisateur pour tester la connexion
        User user = new User();
        user.setName("Test User");
        userRepository.save(user);

        // Vérifiez si l'utilisateur a été enregistré
        long count = userRepository.count();
        return "Nombre d'utilisateurs dans la base de données : " + count;
    }
}
