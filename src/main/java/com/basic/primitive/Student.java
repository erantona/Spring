package com.basic.primitive;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;

    public void setStudentId(int studentId) {
        System.out.println("Setting id");
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        System.out.println("Setting name");
        this.studentName = studentName;
    }

    public void setStudentAddress(String studentAddress) {
        System.out.println("Setting address");
        this.studentAddress = studentAddress;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
