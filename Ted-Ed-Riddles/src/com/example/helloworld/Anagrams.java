package com.example.helloworld;
/*

https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true

Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies.
For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

testing case 1
anagram
margana

2
anagramm
marganaa

3
Hello
hello

 */
import java.util.HashMap;
import java.util.Scanner;
public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.equalsIgnoreCase(b)) {
            return true;
        }
        else {
            if(a.length()!=b.length()) {
                return false;
            }
            else {
                HashMap map_a = new HashMap<Character, Integer>();
                HashMap map_b = new HashMap<Character, Integer>();
                for(int ii=0; ii<a.length(); ii++)
                {
                    char aii=Character.toUpperCase(a.charAt(ii));
                    if( map_a.containsKey(aii) ) {
                        Integer temp = (Integer) map_a.get(aii);
                        map_a.put(aii, temp+1);
                    }
                    else {
                        map_a.put(aii, 1);
                    }
                }

                for(int ii=0; ii<b.length(); ii++)
                {
                    char bii=Character.toUpperCase(b.charAt(ii));
                    if( map_b.containsKey(bii) ) {
                        Integer temp = (Integer) map_b.get(bii);
                        map_b.put(bii, temp+1);
                    }
                    else {
                        map_b.put(bii, 1);
                    }
                }

                boolean isEqual = map_a.equals(map_b); // Returns true
                return isEqual;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

