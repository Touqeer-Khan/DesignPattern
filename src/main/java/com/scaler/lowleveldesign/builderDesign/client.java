package com.scaler.lowleveldesign.builderDesign;

public class client {

    public static void main(String[] args) {

//        Builder builder = new Builder();
//        Student.Builder builder=Student.getBuilder();
//        builder.setAge(25);
//        builder.setHeight(150);
//        builder.setGender("male");
//        builder.setFirstName("John");
//
//        Student student=Builder.build();
        Student student=Student.getBuilder()
                        .setFirstName("John")
                        .setAge(25)
                        .setHeight(150)
                        .setGender("male")
                        .build();
        Student student1=Student.getBuilder()
                .setFirstName("tom")
                .setAge(26)
                .setHeight(167)
                .setGender("male")
                .build();
        System.out.println(student);
    }
}
