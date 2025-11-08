package com.scaler.lowleveldesign.prototypeDesign;

public class main {
    public static void initRegistry(StudentRegistry studentRegistry){
        Student Apr24Biginner=new Student();
        Apr24Biginner.setBatch("Apr 24 Biginner");
        Apr24Biginner.setAvg_psp(90);
        Apr24Biginner.setUniversity("Scaler");
        StudentRegistry.register("Apr24beginner",Apr24Biginner);

        IntelligentStudent intelligentStudent=new IntelligentStudent();
        intelligentStudent.setBatch("Intelligent Student");
        intelligentStudent.setAvg_psp(98);
        intelligentStudent.setUniversity("Scaler");
        StudentRegistry.register("IntelligentStudent",intelligentStudent);

    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry=new StudentRegistry();
        initRegistry(studentRegistry);

        Student Ahmad=StudentRegistry.get("Apr24beginner").clone();
        Ahmad.setName("Ahmad");

        Student Touqeer=StudentRegistry.get("IntelligentStudent").clone();
        Touqeer.setName("Touqeer");


        System.out.println("debug");
    }
}
