package com.example.helloworld;

/*
CodeSignal.

The problem is to add like a kid would do without carrying values: e.g.,
   453
+ 1748 will be
------
  1191

My solution (java) is to convert 2 parameters into arrays (done), then adding them in each place (not completed, but verbalized it)

 */
import java.io.*;

public class AdditionWithoutCarrying {

    static int additionWithoutCarrying(int param1, int param2)
    {
        int param1_array[] = new int[20];
        int remainder = param1;
        int ii = 0;
        do {
            param1_array[ii] = remainder % 10;
            remainder = remainder / 10;
            System.out.println("converting param to array: param1_array[ii]= " + param1_array[ii]  + "; " + remainder + "=" + remainder );
            ii++;
        } while(remainder>=1);

        int param2_array[] = new int[20];
        remainder = param2;
        ii = 0;
        do {
            param2_array[ii] = remainder % 10;
            remainder = remainder / 10;
            System.out.println("converting param to array: param1_array[ii]= " + param2_array[ii]  + "; " + remainder + "=" + remainder );
            ii++;
        } while(remainder>=1);

        int sum[] = new int[20];
        ii = 0;
        while(param1_array[ii] >=1 || param2_array[ii]>=1 ) {
            sum[ii] = (param1_array[ii] + param2_array[ii]) % 10;
            System.out.println("converting param to array: param1_array[ii]= " + param2_array[ii]  + "; " + sum[ii] + "=" + sum[ii] );
            ii++;
        }

        ii = 0;
        int total = 0;
        while(sum[ii] >=1 ) {
            total = (int) (total + sum[ii] * Math.pow(10, ii));
            ii++;
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        int param1 = 453;
        int param2 = 1748;
        int sum = additionWithoutCarrying(param1, param2);
        System.out.println("Addition Without Carrying: " + param1 + "+" + param2 + "=" + sum );
    }
}
