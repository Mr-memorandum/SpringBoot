package com.databaseoperate.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class ExampleController {
    @Autowired
    private UserJPA UserJPA;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<UserEntity> getUserEntity()
    {
        return UserJPA.findAll();
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public UserEntity update(UserEntity userEntity)
    {
        return UserJPA.save(userEntity);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public List<UserEntity> delete(UserEntity userEntity)
    {
        UserJPA.delete(userEntity);
        return UserJPA.findAll();
    }
}
