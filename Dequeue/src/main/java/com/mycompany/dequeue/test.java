/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dequeue;

import java.util.*;

/**
 *
 * @author karen
 */
public class test {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
            //Deque deque = new ArrayDeque<>();//--
            int n = in.nextInt();
            int m = in.nextInt();
            
            int maxUnum = 0;
            int uNum = 0;

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                
                if (deque.size() == m - 1) {
				uNum = computeUniqueNum(deque);
			}
			if (deque.size() >= m - 1) {
				if (!deque.contains(num)) {
					uNum++;
				}
			}
			deque.offerLast(num);

			if (deque.size() > m) {
				int polled = deque.pollFirst();
				if (!deque.contains(polled)) {
					uNum--;
				}
			}

			maxUnum = Math.max(maxUnum, uNum);
            }
            System.out.println(maxUnum);
            in.close();
        }
        
        static int computeUniqueNum(Deque<Integer> deque) {
            return new HashSet<Integer>(deque).size();
        }
}
