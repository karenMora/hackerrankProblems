/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bitset;

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

		int num = sc.nextInt();
		int num2 = sc.nextInt();

		BitSet[] arreglo = new BitSet[3];
		for (int i = 1; i < arreglo.length; i++) {
			arreglo[i] = new BitSet(num);
		}
		for (int i = 0; i < num2; i++) {
			String operation = sc.next();
			int arg1 = sc.nextInt();
			int arg2 = sc.nextInt();
			if (operation.equals("AND")) {
				arreglo[arg1].and(arreglo[arg2]);
			} else if (operation.equals("OR")) {
				arreglo[arg1].or(arreglo[arg2]);
			} else if (operation.equals("XOR")) {
				arreglo[arg1].xor(arreglo[arg2]);
			} else if (operation.equals("FLIP")) {
				arreglo[arg1].flip(arg2);
			} else if (operation.equals("SET")) {
				arreglo[arg1].set(arg2);
			}

			System.out.println(arreglo[1].cardinality() + " " + arreglo[2].cardinality());
		}

		sc.close();
    }
}
