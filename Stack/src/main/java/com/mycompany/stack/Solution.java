/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stack;

import java.util.*;

/**
 *
 * @author karen
 */
public class Solution {
    public static void main(String []argh)
   {
       //--
       HashMap<Character, Character> map = new HashMap<>();
       map.put('(', ')');
       map.put('[', ']');
       map.put('{', '}');
       //--
       Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
         String input=sc.next();
            //Complete the code
          System.out.println(isBalanced(input, map) ? "true" : "false" );//--
      }
       sc.close();//----
   }
    //*
     private static boolean isBalanced(String input, HashMap<Character, Character> map) {
        if ((input.length() % 2) != 0) {
            return false; // odd length Strings are not balanced
        }        
        ArrayDeque<Character> deque = new ArrayDeque<>(); // use deque as a stack
        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            if (map.containsKey(ch)) {
                deque.push(ch);
            } else if (deque.isEmpty() || ch != map.get(deque.pop())) {
                return false;
            }
        }
        return deque.isEmpty();
    }
}
