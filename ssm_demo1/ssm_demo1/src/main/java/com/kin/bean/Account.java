package com.kin.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName : Account
 * @Author : LW
 * @Date: 2021/1/20 21:25
 */
@Data
public class Account implements Serializable {
    private Integer id;
    private String name;
    private double money;
}
