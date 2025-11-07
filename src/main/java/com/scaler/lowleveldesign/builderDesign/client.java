package com.scaler.lowleveldesign.builderDesign;

public class client {

    public static void main(String[] args) {

        Builder builder = new Builder();
        builder.setAge(25);
        builder.setHeight(150);
        builder.setGender("male");
        builder.setFirstName("John");

        Student student=new Student(builder);

        System.out.println(student);
    }
}
