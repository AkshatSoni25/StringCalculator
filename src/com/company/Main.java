package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StringCalculator sc = new StringCalculator();
        int ans = sc.Add("!@#$%^&\n" +
                "-23!@#$%^&*(),[************][%%]" +
                "5\n" +
                "@#$%-12");
        if(ans >= 0){
            System.out.println("Total sum : " + ans);
        }
        int ans2 = sc.Add("//[***]\\n1***2***3");
        int ans3 = sc.Add("//;\\n1;2");
        System.out.println("Number of times Add() called :" + sc.GetCalledCount());
    }
}

class StringCalculator{
    private int count = 0;
    public int Add(String numbers){
        count++;
        int a = 0;
        if(numbers.isEmpty()){
            return 0;
        }
        while(!Character.isDigit(numbers.charAt(a))){
            if(numbers.charAt(a) == '-' && Character.isDigit(numbers.charAt(a+1))){
                break;
            }
            a++;
        }
        String newNum = "";
        for(int j = a; j < numbers.length(); j++){
            newNum += numbers.charAt(j);
        }
        String[] values = newNum.split("[^\\d -]+");
        int result = 0;
        List<Integer> negatives = new ArrayList<>();
        for(String s : values){
            if(Integer.parseInt(s)<0){
                negatives.add(Integer.parseInt(s));
            }
            if(Integer.parseInt(s) >= 1000){
                s = "0";
            }
            result += Integer.parseInt(s);
        }
        if (!negatives.isEmpty()) {
            System.out.print("Negatives not allowed. The negative numbers are: ");
            for (int i : negatives) {
                System.out.print(i+" ");
            }
            System.out.println();
            return -1;
        }
        return result;
    }






//        String[] values = numbers.split("[^\\d]+");
//        int result = 0;
//        List<Integer> negatives = new ArrayList<>();
//        for(String s : values){
//            if(Integer.parseInt(s)<0){
//                negatives.add(Integer.parseInt(s));
//            }
//            if(Integer.parseInt(s) >= 1000){
//                s = "0";
//            }
//            result += Integer.parseInt(s);
//        }
//        if (!negatives.isEmpty()) {
//            System.out.print("Negatives not allowed. The negative numbers are: ");
//            for (int i : negatives) {
//                System.out.print(i+" ");
//            }
//            return -1;
//        }
//        return result;
//    }
    public int GetCalledCount(){
        return count;
    }
}
