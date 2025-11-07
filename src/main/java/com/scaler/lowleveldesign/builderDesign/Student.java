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
    public static  Builder getBuilder(){
        return new Builder();
    }



    //Inner Class----A class within the class
    public static class Builder {

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


        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setAvg_psp(float avg_psp) {
            this.avg_psp = avg_psp;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }







}

