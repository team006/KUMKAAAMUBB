package com.kamaab.softwarepro.Service.Implement;

import com.kamaab.softwarepro.Model.User;
import com.kamaab.softwarepro.Repository.UserRepository;
import com.kamaab.softwarepro.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUser() {
        return userRepository.findAll();
    }
}
