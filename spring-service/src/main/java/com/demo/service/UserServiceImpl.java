package com.demo.service;

import com.demo.entity.PersionInfoEntity;
import com.demo.mapper.PersionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author candy-wind
 * @Data: 2020-04-15 10:24
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    PersionMapper persionMapper;

    @Override
    public String test() {
        return "hello world";
    }

    @Override
    public String insert(PersionInfoEntity persionInfoEntity) {

        persionMapper.insert(persionInfoEntity);
        return "ok";
    }
}
