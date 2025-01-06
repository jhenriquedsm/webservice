package com.jhenriquedsm.webservice.resources;

import com.jhenriquedsm.webservice.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "José", "jose@email.com", "61912345678", "123456");
        return ResponseEntity.ok().body(u);
    }
}