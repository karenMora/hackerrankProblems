/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stringtokens;

import java.io.*;
import java.util.*;

/**
 *
 * @author karen
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        // Write your code here.
        if(s.isEmpty()){
            System.out.println(0);
        }else{
            String []vector=s.split("'+( +|)| +|!+( +|)|,+( +|)|_+( +|)|@+( +|)|\\.+( +|)|\\?+( +|)|\\\\+( +|)");
            System.out.println(vector.length);
            for(int i=0;i<vector.length;i++){
                System.out.println(vector[i]);
            }
        }
        
        scan.close();
    }
}
