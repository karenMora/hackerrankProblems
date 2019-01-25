/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaarraylist;

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
        Scanner sc = new Scanner(System.in);
        int lineas = Integer.parseInt(sc.nextLine());
        ArrayList<ArrayList> listArray = new ArrayList<ArrayList>();
        
        for(int i = 0;i<lineas;i++){
            int num = sc.nextInt();
            ArrayList<Integer> intList =  new ArrayList<Integer>();
            for(int j=0;j<num;j++){
                intList.add(new Integer(sc.nextInt()));
            }
            listArray.add(intList);
            sc.nextLine();
        }
        
        int colas = Integer.parseInt(sc.nextLine());
        for(int i=0;i<colas;i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            sc.nextLine();
            if(x<listArray.size() && y<listArray.get(x).size()){
                System.out.println(listArray.get(x).get(y));
            }else{
                    System.out.println("ERROR!");
                }
        }
    }
        
        
}

