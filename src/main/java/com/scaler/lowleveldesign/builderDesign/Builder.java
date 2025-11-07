package com.scaler.lowleveldesign.builderDesign;


public class Builder {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String address;
    private double height;
    private String university;
    private float avg_psp;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;

    }
    public String getGender() {
        return gender;
    }
    public String getAddress() {
        return address;
    }
    public double getHeight() {
        return height;
    }
    public String getUniversity() {
        return university;
    }
    public float getAvg_psp() {
        return avg_psp;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAvg_psp(float avg_psp) {
        this.avg_psp = avg_psp;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
