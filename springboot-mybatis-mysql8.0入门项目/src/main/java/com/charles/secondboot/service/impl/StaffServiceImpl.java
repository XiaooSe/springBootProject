package com.charles.secondboot.service.impl;

import com.charles.secondboot.common.Result;
import com.charles.secondboot.dao.StaffMapper;
import com.charles.secondboot.domain.entity.Staff;
import com.charles.secondboot.service.StaffService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper dao;

    @Override
    public Result<Boolean> deleteStaff(String staffids) {
        Result<Boolean> rs = new Result<>();
        String[] ids = staffids.split(",");
        for (String staffid: ids) {
            int i = dao.deleteStaff (Integer.parseInt(staffid));
            if (i == 0) {
                return rs.makeFailResult(false);
            }
         }
        return rs.makeSuccessResult(true);
    }

    @Override
    public Result<Boolean> insertStaff(Staff staff) {
        Result<Boolean> rs = new Result<>();
        dao.insertStaff(staff);
        return rs.makeSuccessResult(true);
    }

    @Override
    public Result<PageInfo<Staff>> findAllStaff(int pageNum, int pageSize, Staff staff) {
        PageHelper.startPage(pageNum, pageSize);
        List<Staff> staffs = dao.selectStaffs(staff);
        PageInfo result = new PageInfo(staffs);
        return new Result<>().makeSuccessResult(result);
    }


}
