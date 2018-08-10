package com.charles.secondboot.controller;

import com.charles.secondboot.common.Result;
import com.charles.secondboot.domain.entity.Staff;
import com.charles.secondboot.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping("/getList")
    public Result<?> findAllStaff(@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                  @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                                          int pageSize, Staff staff) {
        return staffService.findAllStaff(pageNum, pageSize, staff);

    }

    @PostMapping("/delStaff")
    public Result<?> deleteStaff(@RequestParam String staffids) { return staffService.deleteStaff(staffids); }

    @PostMapping("/insertStaff")
    public Result<?> insertStaff(@RequestParam String staffName, Timestamp entryTime, Timestamp leaveTime,  Double salary1,

                                 Double salary2, Double salary3, Double salary4, Integer organizeId, Integer departmentId ) {
        Staff staff = new Staff();
            staff.setStaffName(staffName);
            staff.setEntryTime(entryTime);
            staff.setLeaveTime(leaveTime);
            staff.setSalary1(salary1);
            staff.setSalary2(salary2);
            staff.setSalary3(salary3);
            staff.setSalary4(salary4);
            staff.setOrganizeId(organizeId);
            staff.setDepartmentId(departmentId);
        return staffService.insertStaff(staff);
    }
}
