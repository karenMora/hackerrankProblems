/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.outputformatting;

import java.util.Scanner;

/**
 *
 * @author karen
 */
public class Solution {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                
                String s2=sc.next();
                int y=sc.nextInt();
                
                String s3=sc.next();
                int z=sc.nextInt();
                //Complete this line
                System.out.printf("%-14s %03d", s1, x);
                System.out.println();
                System.out.printf("%-14s %03d", s2, y);
                System.out.println();
                System.out.printf("%-14s %03d", s3, z);
                System.out.println();
                System.out.println("================================");
            }

    }
}
