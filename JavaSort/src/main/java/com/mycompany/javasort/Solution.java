/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javasort;

import java.util.*;

/**
 *
 * @author karen
 */
class Student {

    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
class comparar implements Comparator {

    public int compare(Object x, Object y) {
        Student s1 = (Student) x;
        Student s2 = (Student) y;

        if (s1.getCgpa() == s2.getCgpa()) {
            if (s1.getFname() == s2.getFname()) {
                if (s1.getId() < s2.getId()) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
                return s1.getFname().compareTo(s2.getFname());
            }
        } else if (s1.getCgpa() < s2.getCgpa()) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        comparar c = new comparar();

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList, c);

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
