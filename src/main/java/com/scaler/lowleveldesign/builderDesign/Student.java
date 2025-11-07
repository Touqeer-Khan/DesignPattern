package com.scaler.lowleveldesign.builderDesign;




public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String address;
    private double height;
    private String university;
    private float avg_psp;

    public Student(Builder builder){

        if(builder.getAge()<=24){
            throw new IllegalArgumentException("Age must be between 24 and 25.");
        }
        this.firstName= builder.getFirstName();
        this.lastName= builder.getLastName();
        this.age= builder.getAge();
        this.gender= builder.getGender();

        this.address=builder.getAddress();
        this.height=builder.getHeight();
        this.university=builder.getUniversity();
        this.avg_psp=builder.getAvg_psp();

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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }
    public float getAvg_psp() {
        return avg_psp;
    }
    public void setAvg_psp(float avg_psp) {
        this.avg_psp = avg_psp;
    }







}

