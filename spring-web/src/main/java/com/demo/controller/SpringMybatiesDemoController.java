package com.demo.controller;

import com.demo.service.UserService;
import com.demo.entity.PersionInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author candy-wind
 * @Data: 2020-04-15 10:32
 * @Version 1.0
 */

@RestController
@RequestMapping("demo")
public class SpringMybatiesDemoController {


    @Autowired
    private UserService userService;


    @RequestMapping("/test")
    public String test(){
        return userService.test();

    }


    //consumes = "Content-Type:application/json; charset=utf-8"

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public String insert(@RequestBody PersionInfoEntity persionInfoEntity){
        return userService.insert(persionInfoEntity);
    }


}
