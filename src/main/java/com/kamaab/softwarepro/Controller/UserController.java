package com.kamaab.softwarepro.Controller;

import com.kamaab.softwarepro.Service.UserService;
import com.kamaab.softwarepro.Model.User;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/profiles")
    public ResponseEntity<List<User>> getUserAllUser(){
        return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
    }

    @GetMapping("/profile/{id}")
    public ResponseEntity<User> getUserById(@PathVariable long id) {
        return new ResponseEntity<>(userService.getUserById(id).get(), HttpStatus.OK);
    }

    @PostMapping("/profile")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
    }

    @PutMapping("/profile")
    public ResponseEntity<User> updateUser(@Valid @RequestBody User user) {
        return new ResponseEntity<>(userService.save(user), HttpStatus.OK);
    }
//
//    @DeleteMapping("/profile/{id}")
//    public ResponseEntity<Long> deleteUserProfile(@PathVariable long id) {
//        return new ResponseEntity<>(userService.delete(id), HttpStatus.OK);
//    }
}