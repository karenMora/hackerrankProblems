/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exceptionhandlin;

import java.util.Scanner;

/**
 *
 * @author karen
 */
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    int power(int n, int p) throws Exception{
        int sol=0;
        if(n<0 || p<0){
            throw new Exception("n or p should not be negative.");
        }else if(n==0 && p==0){
            throw new Exception("n and p should not be zero.");
        }else{
            sol=(int)Math.pow(n,p);
        }
        return sol;
    }
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}