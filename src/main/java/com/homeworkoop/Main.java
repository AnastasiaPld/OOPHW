package com.homeworkoop;

public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("Nikola Petrov");
        t.setFaculty("History");
        t.setObject("History of Ancient Egypt");
        t.setScore(5);
        t.signForNewClass();
        System.out.println(t.toString());


    }
}