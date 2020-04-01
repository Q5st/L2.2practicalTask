package com.company;

import java.util.Scanner;

public class Emloyee {
    private String name;
    private int rate;
    private int hour;
    public static int sum=0;
    public  int sal;

    public Emloyee() {
    }

    public Emloyee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Emloyee(String name, int rate, int hour) {
        this.name = name;
        this.rate = rate;
        this.hour = hour;
        Emloyee.sum+=this.getSalary();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return this.rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public static void printSum() {System.out.println(sum);}

    public int getSalary() { sal=this.rate*this.hour;
    return sal;
    }

    public String toString() {
        return "Emloyee [Name=" + name + ", Hour=" + hour + ", Rate=" + rate + "]";
    }
    public int changeRate() {
        Emloyee.sum-=this.getSalary();
        System.out.println("New rate:");
        Scanner scanner = new Scanner(System.in);
        int change = scanner.nextInt();
        this.rate = change;
        Emloyee.sum+=getSalary();
        return this.rate;
    }
    public int getBonus() {
        Emloyee.sum-=this.getSalary();
        this.rate*=1.1;
        Emloyee.sum+=getSalary();
        return this.rate;
    }
}
