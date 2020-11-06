package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StringCalculator sc = new StringCalculator();
        int ans = sc.Add("45,34,1000");
        if(ans >= 0){
            System.out.println(ans);
        }
    }
}

class StringCalculator{
    public int Add(String numbers){
        if(numbers.isEmpty()){
            return 0;
        }
        String[] values = numbers.split("[, \n]");
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
            return -1;
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

    }
}
