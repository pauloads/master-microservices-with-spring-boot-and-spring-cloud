package com.in28minutes.rest.webservices.restfulwebservices.service;

import com.in28minutes.rest.webservices.restfulwebservices.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static List<User> users = new ArrayList<>();

    static{
        users.add(new User(1, "Miguel", new Date()));
        users.add(new User(2, "Ana", new Date()));
        users.add(new User(3, "Paulo", new Date()));
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User save(User user) {
        user.setId((int) Math.random());
        users.add(user);
        return user;
    }

    @Override
    public User findById(Integer id) {

        for(User user : users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }
}
