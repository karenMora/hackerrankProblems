/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primalitytest;

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
    private static int num=100;
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      System.out.println(n.isProbablePrime(num)?"prime":"not prime");
      in.close();
      // Write your code here.
   }
}
