/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.syntaxchecker;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author karen
 */
public class Solution {
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      for(;0 < testCases; testCases--){
         String pattern = in.nextLine();
         try{
             Pattern p = Pattern.compile(pattern);
             System.out.println("Valid");
         } catch (PatternSyntaxException e){
             System.out.println("Invalid");
         }
      }
   }
}
