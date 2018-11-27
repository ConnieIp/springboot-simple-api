package com.tw.apistackbase.model;

public class Employee {
    private static int counter=1;
    private int id;
    private String name;
    private int age;
    private String gender;

    public Employee() {
        this.id =  counter++;
    }

    public Employee(String name, int age, String gender) {
        this.id = counter++;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
