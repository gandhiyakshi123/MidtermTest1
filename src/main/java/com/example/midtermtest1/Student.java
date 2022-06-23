package com.example.midtermtest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Student
{
    private int studentNum;
    private String firstName, lastName, gender, telephone , province, majorCode;
    private int avgGrade;

    public Student(int studentNum, String firstName, String lastName, String gender, String telephone, String province, String majorCode, int avgGrade) {
        setStudentNum(studentNum);
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setTelephone(telephone);
        setProvince(province);
        setMajorCode(majorCode);
        setAvgGrade(avgGrade);
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum)
    {
        //The student number should be in the range 200034000 to 200070000
        if(studentNum > 200034000 && studentNum < 200070000)
        {
            this.studentNum = studentNum;
        }
        else
        {
            throw new IllegalArgumentException("The student number should be in the range 200034000 to 200070000");
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        //First name must be more than 1 character
        firstName = firstName.trim();
        if (firstName.length() >= 1)
        {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("invalid first name, must be 1 or more character");
        }
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        //last name must be more than 1 character
        lastName = lastName.trim();
        if (lastName.length() >= 1)
        {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("invalid last name, must be 1 or more character");
        }
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

    public void setTelephone(String telephone)
    {
        //Telephone number should match the North American dialing plan (NXX NXX-XXXX, where N denotes 2–9, and X is any digit 0–9).
        if(telephone.matches("\\(?[2-9]\\d{2}\\)?[-\\s]?[2-9]\\d{2}[-\\s]?\\d{4}")) {
            this.telephone = telephone;
        }
        else {
            throw new IllegalArgumentException("Invalid phone, Please enter valid 10 digit number");
        }
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        //Province should be in the list of "AB","BC","MB","NB","NL","NS","NT","NU","ON","PE","QC","SK","YT"
        List<String> provinceName= Arrays.asList("AB", "BC", "MB", "NB", "NL", "NS", "NT", "NU", "ON", "PE", "QC", "SK", "YT");
        if(provinceName.contains(province))
        {
            this.province = province;
        }
        else
        {
            throw new IllegalArgumentException(province + " is not valid, coose from " + provinceName);
        }

    }

    public String getMajorCode() {
        return majorCode;
    }

    public void setMajorCode(String majorCode)
    {
        //Major Code must be 4 upper case letters only
        if(majorCode == majorCode.toUpperCase())
        {
            this.majorCode = majorCode;
        }
        else
        {
            throw new IllegalArgumentException("Major Code must be 4 upper case letters only");
        }

    }

    public int getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(int avgGrade) {
        //Average grade must be in the range of 0-100 (inclusive)
        if (avgGrade >= 0 && avgGrade <= 100) {
            this.avgGrade = avgGrade;
        } else
        {
            throw new IllegalArgumentException("Average grade must be in the range of 0-100");
        }
    }
}
