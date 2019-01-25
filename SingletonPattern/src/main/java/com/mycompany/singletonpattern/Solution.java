/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.singletonpattern;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

/**
 *
 * @author karen
 */
class Singleton {
    public String str;
    private static Singleton INSTANCE = new Singleton();
    
    private Singleton(){
        str = "";
    }
    
    public static Singleton getSingleInstance(){    
        return INSTANCE;
    }
}