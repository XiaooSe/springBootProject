package com.charles.secondboot.dao;

import com.charles.secondboot.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    int deleteUser(Integer userId);

    int insertUser (User user);

    List<User> selectUsers(User user);
}
