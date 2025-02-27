package com.webecommerce.web.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webecommerce.web.model.User;
import com.webecommerce.web.repository.UserRepository;
import com.webecommerce.web.services.UserServices;
@Service
public class UserServicesimp implements UserServices{
    @Autowired
    private UserRepository userrepository;

    @Override
    public User saveUser(User user){
        return userrepository.save(user);
    }
}
