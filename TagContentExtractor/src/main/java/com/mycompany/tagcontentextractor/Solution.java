/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tagcontentextractor;

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
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int testCases = Integer.parseInt(in.nextLine());
       
       String regexPatern = "(<[^>]*>)";
       Pattern stringPatern  = Pattern.compile(regexPatern);
       
       while(testCases>0){
           String line = in.nextLine();
           //Write your code here
           
           int pos = 0;
          	Matcher m = stringPatern.matcher(line);
          	String siguiente = null;
          	int anterior = -1;
          	boolean fin = false;
          	while(m.find())
          	{	
              	String htmlTag = line.substring(m.start(),m.end());
              	if(htmlTag.charAt(1) != '/')
              	{
	            	siguiente = htmlTag;
	               	anterior = m.end();
              	}else if(htmlTag.charAt(1) == '/' && siguiente != null){
                  	if(siguiente.substring(1).equals(htmlTag.substring(2))&&siguiente.length()>2 && m.start()>anterior+1){
                    	System.out.println(line.substring(anterior,m.start()));
                      	fin = true;
                  	}
                	siguiente = null;
              	}
          	}
           
           System.out.print(fin?"":"None\n");
           testCases--;
      }
   }
}
