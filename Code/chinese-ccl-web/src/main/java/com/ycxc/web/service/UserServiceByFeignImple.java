package com.ycxc.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ycxc.web.model.User;

@Component
public class UserServiceByFeignImple implements UserServiceByFeign{

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<User>();
    }

}