package com.example.demosp.mapper;


import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAll();
    List<User>  getLb(Long id);
}
