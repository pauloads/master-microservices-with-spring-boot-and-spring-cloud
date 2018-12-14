package com.in28minutes.rest.webservices.restfulwebservices.service;

import com.in28minutes.rest.webservices.restfulwebservices.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User save(User user);

    User findById(Integer id);

}
