/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stringsintroduction;

import java.io.*;
import java.util.*;

/**
 *
 * @author karen
 */
public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());
        if (B.compareTo(A) < 0) {
            System.out.println("Yes");
        } else if (B.compareTo(A) > 0) {
            System.out.println("No");
        } else if (B.compareTo(A) == 0) {
            System.out.println("No");
        }
        String a = "" + A.charAt(0);
        String b = "" + B.charAt(0);
        System.out.println(a.toUpperCase() + A.substring(1) + " " + b.toUpperCase() + B.substring(1));
    }
}
