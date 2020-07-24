package com.yale.demo.service;

import com.yale.demo.entity.User;
import com.yale.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yale
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userDMapper;

    public User selectUserById(Long id){
        return userDMapper.selectById(id);
    }
}
