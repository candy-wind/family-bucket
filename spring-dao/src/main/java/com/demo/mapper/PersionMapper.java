package com.demo.mapper;


import com.demo.entity.PersionInfoEntity;
//import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author candy-wind
 * @Data: 2020-04-15 10:30
 * @Version 1.0
 */

//@Mapper
@Repository
public interface PersionMapper   {

    int insert(PersionInfoEntity persionInfoEntity);


}
