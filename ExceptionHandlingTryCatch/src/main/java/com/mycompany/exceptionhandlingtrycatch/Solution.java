/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exceptionhandlingtrycatch;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author karen
 */
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
        try {
            int x=in.nextInt();
            int y=in.nextInt();
            int z=x/y;
            System.out.print(z);
        }catch(InputMismatchException e){
            System.out.print("java.util.InputMismatchException");
        }catch(Exception e){
            System.out.print(e);
        }
    }
}
