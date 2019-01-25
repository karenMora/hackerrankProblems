/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.subarray;

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
        int n = scan.nextInt();
        int[] a = new int[n];
        
        for(int i = 0;i < n;i++){
            a[i] = scan.nextInt();
        }
        scan.close();
        
        int arregloNegativo = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                
                int suma = 0;
                
                for(int k = i; k <= j; k++) {
                    suma +=a[k];
                }
                
                if(suma < 0) {
                    arregloNegativo++;
                }
            }
        }
        System.out.println(arregloNegativo);
    }
}
