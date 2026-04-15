package com.example.helloworld;

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
                for(int ii=0; ii<a.length(); ii++)
                {
                    char aii=a.charAt(ii);
                    char b_ii=b.charAt(b.length()-ii-1);
                    if( aii == b_ii || aii == Character.toLowerCase(b_ii) || aii == Character.toUpperCase(b_ii) ) {
                        continue;
                    }
                    else
                    {
                        return false;
                    }
                }
                return true;
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

