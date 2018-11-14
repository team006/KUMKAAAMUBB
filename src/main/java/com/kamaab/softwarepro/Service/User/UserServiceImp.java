package com.kamaab.softwarepro.Service.User;

import com.kamaab.softwarepro.Model.User.User;
import com.kamaab.softwarepro.Repository.User.UserRepository;
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
