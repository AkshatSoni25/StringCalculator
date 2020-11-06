package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        StringCalculator sc = new StringCalculator();
        System.out.println(sc.Add("23,87,67"));
    }
}

class StringCalculator{
    public int Add(String numbers){
//        int len = numbers.length();
        String[] values =numbers.split(",");
        if(values.length == 0){
            return 0;
        }
        int result = 0;
        for(String s : values){
            result += Integer.parseInt(s);
        }
        return result;
//        else if(values.length == 1){
//            return Integer.parseInt(values[0]);
//        } else if(values.length == 2){
//            return Integer.parseInt(values[0])+Integer.parseInt(values[1]);
//        }
//        else{
//            return Integer.parseInt(values[0])+Integer.parseInt(values[1])+Integer.parseInt(values[2]);
//        }
//        for(String s : operators) {
//            System.out.print(s+ " ");
//        }
//        System.out.println();
//        for(String s : operands) {
//            System.out.print(s+ " ");
//        }

    }
}
