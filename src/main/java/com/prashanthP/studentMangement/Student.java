package com.prashanthP.studentMangement;

public class Student {
    private int adminNo;
    private String name;
    private int age;
    private String state;

    public Student(int adminNo, String name, int age, String state) {
        this.adminNo = adminNo;
        this.name = name;
        this.age = age;
        this.state = state;
    }

    public int getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(int adminNo) {
        this.adminNo = adminNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
