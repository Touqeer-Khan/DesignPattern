package com.scaler.lowleveldesign.prototypeDesign;

public class Student implements Prototype<Student> {
    private String Name;
    private int Age;
    private String Gender;
    private String Batch;
    private float Avg_psp;
    private String University;



    public Student(){}



    public Student(Student student) {
        this.Name = student.Name;
        this.Age = student.Age;
        this.Gender = student.Gender;
        this.Batch = student.Batch;
        this.Avg_psp = student.Avg_psp;
        this.University = student.University;

    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public String getBatch() {
        return Batch;
    }

    public float getAvg_psp() {
        return Avg_psp;
    }

    public String getUniversity() {
        return University;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setBatch(String batch) {
        Batch = batch;
    }

    public void setAvg_psp(float avg_psp) {
        Avg_psp = avg_psp;
    }

    public void setUniversity(String university) {
        University = university;
    }
}
