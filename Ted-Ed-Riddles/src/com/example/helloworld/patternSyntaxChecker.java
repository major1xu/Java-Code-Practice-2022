package com.example.helloworld;
/*
5
([a]+)(.+)
[.]+
[.]*
[ ]*
[AAAAAAAAAAAAAAAAAAAAAAAA]*

why java pattern compile failed for [ ]*
 */

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class patternSyntaxChecker {

    static void isValidPattern(String regex)
    {
        try {
            Pattern.compile(regex);
            System.out.println("Valid");
        } catch (PatternSyntaxException e){
            System.out.println("Invalid");
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String numSring = scan.next();
        int num = Integer.parseInt(numSring);
        for(int ii=0; ii<num; ii++){
            String b = scan.next();
            isValidPattern(b);
        }
        scan.close();
    }
}