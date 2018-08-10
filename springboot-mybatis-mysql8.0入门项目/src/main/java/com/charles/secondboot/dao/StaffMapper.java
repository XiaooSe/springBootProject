package com.charles.secondboot.dao;

import com.charles.secondboot.common.Result;
import com.charles.secondboot.domain.entity.Staff;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffMapper {

    List<Staff> selectStaffs(Staff staff);

    int deleteStaff (Integer staffid);

    int insertStaff (Staff staff);


}
