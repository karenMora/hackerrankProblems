/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        Scanner sc = new Scanner(System.in);
        int i=1;
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        while (sc.hasNext()) {
        	String s=sc.nextLine();
        	System.out.println(i + " " + s);
        	i++;
        }
    }
}
