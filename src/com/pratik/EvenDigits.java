package com.pratik;
import java.util.Scanner;
import java.util.Arrays;

public class EvenDigits {
    public static void main(String[] args){
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[]nums){
        int count = 0;
        for(int num: nums){   //For Every number in number contain
            if(even(num)){    //Even Digit then just count++
                count++;
            }
        }
        return count ;
    }
    //Function to check wheather a number contains even digits or not.
    static boolean even(int num){
        int numberofDigits = digits(num);
        if(numberofDigits % 2 == 0){
            return true;
        }
        return false;
    }
    //count number of digits in a number
    static int digits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num /10;   //num /=10
        }
        return count ;
    }
}
