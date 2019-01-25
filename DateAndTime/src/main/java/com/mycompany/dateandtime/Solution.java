/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dateandtime;

/**
 *
 * @author karen
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
 
class Result {
    private static String[] strDay = new String[] {"SUNDAY","MONDAY","TUESDAY",
        "WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
    /*
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(Integer.toHexString(year)), Integer.parseInt(Integer.toHexString((month)-1)),Integer.parseInt(Integer.toHexString(day)));
        return strDay[cal.get(Calendar.DAY_OF_WEEK) - 1];
    }*/
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
    public static String getDay(String day, String month, String year) {
        LocalDate lc = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        return lc.getDayOfWeek().toString();
}
}
