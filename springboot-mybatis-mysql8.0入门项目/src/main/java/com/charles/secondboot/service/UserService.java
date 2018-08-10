package com.charles.secondboot.service;

import com.charles.secondboot.common.Result;
import com.charles.secondboot.domain.entity.User;
import com.github.pagehelper.PageInfo;

public interface UserService {

    Result<Boolean> deleteUser(String userIds);

    Result<Boolean> insertUser(User user);

    Result<PageInfo<User>> findAllUser(int pageNum, int pageSize, User user);
}
