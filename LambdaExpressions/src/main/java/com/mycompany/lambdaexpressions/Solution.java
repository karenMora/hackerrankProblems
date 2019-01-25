/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lambdaexpressions;

import java.io.*;
import java.util.*;

/**
 *
 * @author karen
 */
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }

    public static PerformOperation isOdd() {
        return (a -> {
            if (a % 2 == 0) {
                return false;
            } else {
                return true;
            }
        });
    }

    public static PerformOperation isPrime() {
        return (a -> {
            if (a < 2) {
                return false;
            }
            int rz = (int) Math.sqrt(a);
            for (int x = 2; x < rz; x++) {
                if (a % x == 0) {
                    return false;
                }
            }
            return true;
        });
    }

    public static PerformOperation isPalindrome() {
        return (a -> {
            String word = Integer.toString(a);
            boolean sol = true;
            int tmn = word.length();
            for (int i = 0; i < word.length(); i++) {
                if (word.substring(i, i + 1).equals(word.substring(tmn - 1, tmn)) == false) {
                    sol = false;
                    break;
                }
                tmn -= 1;
            }
            return sol;
        });
    }

}

public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
