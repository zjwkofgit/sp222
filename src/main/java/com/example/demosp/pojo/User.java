package com.example.demosp.pojo;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private Integer dpid;
    private Dept dept;
}
