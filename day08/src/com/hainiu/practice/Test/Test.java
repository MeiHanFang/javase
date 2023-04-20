package com.hainiu.practice.Test;

public class Test {
    public static void main(String[] args) {
        MathTeacher mt1 = new MathTeacher();
        mt1.setName("Tom");
        mt1.setAge(30);
        mt1.setPhoneNumber("18923416745");
        mt1.showInfo(mt1.getName(),mt1.getAge(),mt1.getPhoneNumber());
        mt1.teach();

        System.out.println("=====");

        MathTeacher mt2 = new MathTeacher("Jerry",35,"13378653562");
        mt2.showInfo(mt2.getName(),mt2.getAge(),mt2.getPhoneNumber());
        mt2.teach();
    }
}
