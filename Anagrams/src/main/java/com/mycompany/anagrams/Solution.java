/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.anagrams;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author karen
 */
public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
        boolean temp=false;
        char[] vector=a.toCharArray();
        Arrays.sort(vector);
        char[] vector2=b.toCharArray();
        Arrays.sort(vector2);
        String x=new String(vector);
        String y=new String(vector2);
        if(x.equals(y)){
            temp=true;
        }
        return temp;
    }
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
