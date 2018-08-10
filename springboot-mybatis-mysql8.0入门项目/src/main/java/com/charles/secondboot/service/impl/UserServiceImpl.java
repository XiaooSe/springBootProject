package com.charles.secondboot.service.impl;

import com.charles.secondboot.common.Result;
import com.charles.secondboot.dao.UserMapper;
import com.charles.secondboot.domain.entity.User;
import com.charles.secondboot.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper dao;

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public Result<Boolean> deleteUser(String userIds) {
        Result<Boolean> rs = new Result<>();
        String[] ids = userIds.split(",");
        for (String id: ids) {
            int i = dao.deleteUser(Integer.parseInt(id));
            if (i == 0) {
                return new Result<>().makeFailResult(false);
            }
        }
        return new Result<>().makeSuccessResult(true);
    }

    @Override
    public Result<PageInfo<User>> findAllUser(int pageNum, int pageSize, User user) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = dao.selectUsers(user);
        PageInfo result = new PageInfo(users);
        return new Result<>().makeSuccessResult(result);
    }


    @Override
    public Result<Boolean> insertUser(User user) {
        dao.insertUser(user);
        return new Result<>().makeSuccessResult(true);
    }

}
