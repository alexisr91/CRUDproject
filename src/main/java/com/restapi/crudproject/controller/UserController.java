package com.restapi.crudproject.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.crudproject.model.User;
import com.restapi.crudproject.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
//Gestion des requetes HTTP
public class UserController {

    @Autowired
    //Injection de dépendance dans une classe
    private UserRepository userRepository;

   
    
    @PostMapping("/user")
    //L'annotation @PostMapping est utilisée pour mapper une requête HTTP POST à une méthode spécifique dans votre contrôleur. En d'autres termes, elle indique que lorsque le serveur reçoit une requête POST à une certaine URL, il doit appeler la méthode annotée.
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
