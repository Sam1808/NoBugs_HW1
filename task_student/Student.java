package org.example.task_student;

public class Student implements Printable{
    private String studentName;
    private int studentDocNumber;
    private double studentProgress;

    public void setStudentName(String name) {
        this.studentName = name;
    }
    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentDocNumber(int doc_num) {
        this.studentDocNumber = doc_num;
    }
    public double getStudentDocNumber() {
        return this.studentDocNumber;
    }

    public void setStudentProgress(double count) {
        this.studentProgress = count;
    }
    public double getStudentProgress() {
        return this.studentProgress;
    }

    @Override
    public void print() {
        System.out.println("Имя студента: " + getStudentName());
        System.out.println("Номер зачетки студента: " + getStudentDocNumber());
        System.out.println("Успеваемость студента: " + getStudentProgress());
    }
}
