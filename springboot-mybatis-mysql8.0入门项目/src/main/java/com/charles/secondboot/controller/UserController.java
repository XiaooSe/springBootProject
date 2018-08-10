package com.charles.secondboot.controller;

import com.charles.secondboot.common.Result;
import com.charles.secondboot.domain.entity.User;
import com.charles.secondboot.service.UserService;
import com.github.pagehelper.PageInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@MapperScan("com.charles.secondboot.dao")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getList")
    public Result<?> findAllUser(@RequestParam(name = "pageNum", required = false, defaultValue = "1")
                                          int pageNum,
                                 @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                                          int pageSize,
                                 User user) {
        return userService.findAllUser(pageNum,pageSize, user);
    }

    @PostMapping("/del")
    public Result<?> deleteUser(@RequestParam String userIds) {
        return userService.deleteUser(userIds);
    }

    @PostMapping("/insert")
    public Result<?> insert(@RequestParam String userName,@RequestParam String password,@RequestParam String phone ) {
        User user = new User();
        user.setUserName(userName);
        user.setPhone(phone);
        user.setPassword(password);
        return userService.insertUser(user);
    }
}
