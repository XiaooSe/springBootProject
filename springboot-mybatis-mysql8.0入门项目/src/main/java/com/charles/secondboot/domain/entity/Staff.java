package com.charles.secondboot.domain.entity;


public class Staff {

    private long staffid;

    private String staffName;

    private java.sql.Timestamp entryTime;

    private java.sql.Timestamp leaveTime;

    private double salary1;

    private double salary2;

    private double salary3;

    private double salary4;

    private long organizeId;

    private String organizeName;

    private String departmentName;

    private long departmentId;

    private long age;


    public long getStaffid() {
        return staffid;
    }

    public void setStaffid(long staffid) {
        this.staffid = staffid;
    }


    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }


    public java.sql.Timestamp getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(java.sql.Timestamp entryTime) {
        this.entryTime = entryTime;
    }


    public java.sql.Timestamp getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(java.sql.Timestamp leaveTime) {
        this.leaveTime = leaveTime;
    }


    public double getSalary1() {
        return salary1;
    }

    public void setSalary1(double salary1) {
        this.salary1 = salary1;
    }


    public double getSalary2() {
        return salary2;
    }

    public void setSalary2(double salary2) {
        this.salary2 = salary2;
    }


    public double getSalary3() {
        return salary3;
    }

    public void setSalary3(double salary3) {
        this.salary3 = salary3;
    }


    public double getSalary4() {
        return salary4;
    }

    public void setSalary4(double salary4) {
        this.salary4 = salary4;
    }


    public long getOrganizeId() {
        return organizeId;
    }

    public void setOrganizeId(long organizeId) {
        this.organizeId = organizeId;
    }


    public String getOrganizeName() {
        return organizeName;
    }

    public void setOrganizeName(String organizeName) {
        this.organizeName = organizeName;
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }


    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

}
