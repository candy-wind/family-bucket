package com.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author candy-wind
 * @Data: 2020-04-14 17:53
 * @Version 1.0
 */


@Data
public class PersionInfoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String password;
}
