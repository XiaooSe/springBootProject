package com.charles.secondboot.service;

import com.charles.secondboot.common.Result;
import com.charles.secondboot.domain.entity.Staff;
import com.github.pagehelper.PageInfo;

public interface StaffService {

    Result<PageInfo<Staff>> findAllStaff(int pageNum, int pageSize, Staff staff);

    Result<Boolean> deleteStaff(String staffids);

    Result<Boolean> insertStaff(Staff staff);

}
