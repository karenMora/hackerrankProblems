/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.priorityqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author karen
 */
import java.util.*;
class Student implements Comparable<Student>{
    String name = new String();
    double cgpa;
    int id;
    public Student(String nme,double cgp,int idf)
    {
        name = nme;
        cgpa = cgp;
        id = idf;
    }
    public String getName(){
        return name;
    }
    public int compareTo(Student s)
    {
        if(cgpa == s.cgpa)
        {
            if(name.compareTo(s.name) == 0)
            {
                if(id == s.id)
                    return 0;
                else if (id > s.id)
                    return 1;
                else
                    return -1;
            }
            else
                return name.compareTo(s.name);
        }
        else if(cgpa > s.cgpa)
            return -1;
        else
            return 1;
    }
}

class Priorities{
    public ArrayList<Student> getStudents(List<String> events)
    {
        int n = events.size();
        PriorityQueue<Student> cola = new PriorityQueue<Student>();
        for(String i:events)
        {
            String[] arreglo = new String[4];
            arreglo = i.split("\\s");
            if(arreglo.length>1)
            {
                cola.add(new Student(arreglo[1],Double.valueOf(arreglo[2]),Integer.valueOf(arreglo[3])));
            }
            else
            {
                cola.poll();
            }
        }
        while(cola.size()>1)
        {
            System.out.println(cola.poll().name);
        }
        return new ArrayList<Student>(cola);
    }
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
