package com.company;

import com.company.Emloyee;

public class Main {

    public static void main(String[] args) {
        Emloyee em1 = new Emloyee("asdf", 5, 7);
        Emloyee em2 = new Emloyee("aasdfgdf", 3, 8);
        em2.changeRate();
        em2.getSalary();
        Emloyee em3 = new Emloyee("adsgf", 6, 2);
        em3.getBonus();
        em3.getSalary();
        System.out.println(em1);
        System.out.println(em2);
        System.out.println(em3);
        Emloyee.printSum();
    }
}
