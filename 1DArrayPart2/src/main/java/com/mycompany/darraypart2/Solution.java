/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.darraypart2;

import java.util.*;


/**
 *
 * @author karen
 */
public class Solution {
    public static boolean canWin(int leap, int[]  game, int i) {
        if (i < 0 || game[i] == 1) {
            return false;
        } else if (i + 1 >= game.length || i + leap >= game.length) {
            return true;
        }
        game[i] = 1;
        return canWin(leap,game, i + leap) || canWin(leap,game,i + 1) || canWin(leap,game, i - 1);
        // Return true if you can win the game; otherwise, return false.
    }
    
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            System.out.println( (canWin(leap, game, 0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
