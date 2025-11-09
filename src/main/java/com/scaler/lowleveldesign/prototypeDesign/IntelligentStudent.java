package com.scaler.lowleveldesign.prototypeDesign;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent() {}

    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
