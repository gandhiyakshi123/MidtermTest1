package com.example.midtermtest1;

public class Student
{
    private int studentNum;
    private String firstName, lastName, gender, telephone , province, majorCode;
    private int avgGrade;

    public Student(int studentNum, String firstName, String lastName, String gender, String telephone, String province, String majorCode, int avgGrade) {
        this.studentNum = studentNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.telephone = telephone;
        this.province = province;
        this.majorCode = majorCode;
        this.avgGrade = avgGrade;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getMajorCode() {
        return majorCode;
    }

    public void setMajorCode(String majorCode) {
        this.majorCode = majorCode;
    }

    public int getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(int avgGrade) {
        this.avgGrade = avgGrade;
    }
}
