/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javamap;

import java.util.*;
import java.io.*;

/**
 *
 * @author karen
 */
class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      Map mapa = new HashMap();
      int n=in.nextInt();
      in.nextLine();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
         mapa.put(name,phone);
      }
      
      while(in.hasNext())
      {
         String s=in.nextLine();
         if(mapa.containsKey(s)){
             System.out.print(s + "=" + mapa.get(s));
             System.out.println();
         }
          else{
              System.out.print("Not found");
              System.out.println();
          }
      }
   }
}