/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javalist;

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
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        LinkedList<Integer> lista = new LinkedList<>();
        for (int i = 0; i < num1; i++) {
            int valor = scan.nextInt();
            lista.add(valor);
        }
        int num2 = scan.nextInt();
        for (int i = 0; i < num2; i++) {
            String action = scan.next();
            if (action.equals("Insert")) {
                int numI = scan.nextInt();
                int valor = scan.nextInt();
                lista.add(numI, valor);
            } else {
                int numI = scan.nextInt();
                lista.remove(numI);
            }
        }
        scan.close();
        for (Integer num : lista) {
            System.out.print(num + " ");
        }
        
        
    }
}
