/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bigdecimal;

import java.math.BigDecimal;
import java.util.*;

/**
 *
 * @author karen
 */
public class Solution {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        Arrays.sort(s, 0,n,Collections.reverseOrder(new Comparator<String>() {
    public int compare(String x, String y) {
        BigDecimal numX = new BigDecimal(x);
        BigDecimal numY = new BigDecimal(y);
        return numX.compareTo(numY);
    }
}));

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}