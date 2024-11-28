package org.example.task_student;

import java.util.ArrayList;

public class StudentManager extends Student{
    public ArrayList<Student> students;


    public void addStudent(Student student) {
        this.students.add(student);
    };

    public void removeStudent(int id) {
        this.students.remove(students.get(id));
    };

    public void getStudents() {
        System.out.println(this.students);
    };
}
