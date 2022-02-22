package com.example.demosp.mapper;


import com.example.demosp.pojo.Dept;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    Dept getById(Long id);
}
