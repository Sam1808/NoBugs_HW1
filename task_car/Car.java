package org.example.task_car;

public class Car implements Drivable {
    private String brand;
    private String model;
    private int year;

    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String name) {
        this.brand = name;
    }
    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public void start() {
        System.out.println(getBrand() + " " + getModel() + "->Starting engine" + " " + getYear());
    }

    @Override
    public void stop() {
        System.out.println(getBrand() + " " + getModel() + "->Stopping engine" + " " + getYear());
    }

    @Override
    public int drive(int distance) {
        System.out.println("Drive " + distance + " miles");
        return distance;
    }
}
