package org.example;

import org.example.task_book.Book;
import org.example.task_car.Car;
import org.example.task_student.Student;
import org.example.tast_clock.Clock;
import org.example.tast_point.Point;

public class Main {
    public static void main(String[] args) {
        System.out.println("Книга:");
        Book book1 = new Book();
        book1.setBookName("Book1");
        book1.setBookAuthor("Alex Pshe");
        book1.setBookDate("2024");
        book1.print();
        System.out.println("======");

        System.out.println("Студент:");
        Student student1 = new Student();
        student1.setStudentName("Иван Попов");
        student1.setStudentDocNumber(1234567);
        student1.setStudentProgress(3.87);
        student1.print();
        System.out.println("=====");

        System.out.println("Точка на плоскости:");
        Point point1 = new Point();
        point1.setX(10);
        point1.setY(20);
        System.out.println("Текущее положение X и Y -> " + point1.getX() + "х" + point1.getY());
        point1.moveUp();
        point1.moveRight();
        System.out.println("Новое положение X и Y -> " + point1.getX() + "х" + point1.getY());
        System.out.println("=====");

        System.out.println("Часы:");
        Clock clock1 = new Clock();
        clock1.setHours(12);
        clock1.setMinutes(10);
        clock1.setSeconds(30);
        System.out.println("Текущее время...");
        clock1.readTime();
        System.out.println("Новое время...");
        clock1.tick();
        clock1.readTime();
        System.out.println("=====");

        System.out.println("Автомобиль:");
        Car car1 = new Car();
        car1.setBrand("Daihatsu");
        car1.setModel("Storia");
        car1.setYear(2001);

        car1.start();
        car1.drive(28);
        car1.stop();
    }
}