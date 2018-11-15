package com.kamaab.softwarepro.Controller;

import com.kamaab.softwarepro.Model.User;
import com.kamaab.softwarepro.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> findAllUser(){
        List<User> users = userService.findAllUser();
        return new ResponseEntity<List<User>>(users,HttpStatus.OK);
    }



}
