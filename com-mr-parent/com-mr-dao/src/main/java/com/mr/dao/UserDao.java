package com.mr.dao;

import com.mr.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper  //保证被扫描到
public interface UserDao {
    List<User> queryUser();
}
