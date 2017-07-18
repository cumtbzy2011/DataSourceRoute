package com.bian.controller;

import com.bian.dao.entity.UserEntity;
import com.bian.dao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bianzy
 * @create 2017-07-18 17:32
 **/
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("save")
    public UserEntity save(UserEntity userEntity){
        return userRepository.save(userEntity);
    }

    @RequestMapping("find")
    public UserEntity find(Long id) {
        return userRepository.findOne(id);
    }
}
