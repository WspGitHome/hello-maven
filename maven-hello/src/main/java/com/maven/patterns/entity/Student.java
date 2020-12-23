package com.maven.patterns.entity;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.entity
 * @Classname Student
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/30 16:36
 * @Version 1.0
 */
public class Student {

    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    static {
        System.out.println("loaded the staic code!");
    }

    private String name;
    private String number;

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static void main(String[] args) throws Exception {
        String s = new String("ABC") + "ABC";
        System.out.println(s);
    }
}
