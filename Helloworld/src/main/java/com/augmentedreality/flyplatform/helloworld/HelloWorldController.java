package com.augmentedreality.flyplatform.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloworldController
{
    @ResponseBody
    @RequestMapping("/hello")
    public String hello()
    {
        return "hello world";
    }
}
