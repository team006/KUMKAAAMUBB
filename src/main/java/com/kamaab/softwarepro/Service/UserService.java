package com.kamaab.softwarepro.Service;

import com.kamaab.softwarepro.Repository.UserRepository;
import com.kamaab.softwarepro.Model.User;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository​​​​​​;

    public List<User> getAllUser() {
        return userRepository​​​​​​.findAll();
    }

    public Optional<User> getUserById(long id) {
        return userRepository​​​​​​.findById(id);
    }

    public User save(User user) {
        return userRepository​​​​​​.save(user);
    }

    public long delete(long id) {
        userRepository​​​​​​.deleteById(id);
        return id;
    }
}
