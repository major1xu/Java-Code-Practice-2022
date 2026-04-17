package com.example.helloworld;

/*
Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

Input Format

A single string, .

Constraints

 is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
Output Format

On the first line, print an integer, , denoting the number of tokens in string  (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string .

Sample Input
test case 1
He is a very very good boy, isn't he?
Sample Output

10
He
is
a
very
very
good
boy
isn
t
he
Explanation

We consider a token to be a contiguous segment of alphabetic characters. There are a total of  such tokens in string , and each token is printed in the same order in which it appears in string .

test case 2
Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!

 */

import java.io.*;
import java.util.*;
public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        // https://www.geeksforgeeks.org/java/split-string-java-examples/
        // refer to example 6
        // Explanation: The regex splits the string at any listed symbol. + ensures consecutive delimiters are treated as one.
        String regex = "[, '!?.@_]+";
        String s2 = s.strip();
        if(s2.length()==0) {
            System.out.println(0);
        }
        else {
            String[] arr = s2.split(regex);
            System.out.println(arr.length);

            for (String str : arr) {
                System.out.println(str);
            }
        }
        scan.close();
    }
}
