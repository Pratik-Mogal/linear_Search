package com.pratik;
import java.util.Scanner;
import java.util.Arrays;

public class RunonIteration {
    public static void main(String[] args) {
        String name = "Pratik";
        char target = 'a';
        System.out.println(Arrays.toString(name.toCharArray()));

    }
    static boolean linear2(String str ,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch ==target) {
                return true;
            }
        }
        return false ;
    }

}
