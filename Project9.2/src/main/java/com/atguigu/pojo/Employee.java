package com.atguigu.pojo;

public class Employee {
    private Integer eid;
    private String empName;
    private Integer age;
    private Character sex;
    private String phone;

    public Employee() {
    }

    public Employee(Integer eid, String empName, Integer age, Character sex, String phone) {
        this.eid = eid;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                '}';
    }
}
