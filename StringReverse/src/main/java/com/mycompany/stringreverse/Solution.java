/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stringreverse;

import java.io.*;
import java.util.*;

/**
 *
 * @author karen
 */
public class Solution {
    private static boolean palindrome(String palabra){
        boolean respuesta=0==palabra.compareTo(new StringBuilder(palabra).reverse().toString());
        return respuesta;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(palindrome(A)?"Yes":"No");
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
