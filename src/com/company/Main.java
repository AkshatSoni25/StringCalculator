package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StringCalculator sc = new StringCalculator();
        int ans = sc.Add("45,34\n" +
                "56");
        if(ans >= 0){
            System.out.println(ans);
        }
        int ans2 = sc.Add("1000\n" +
                "56");
        int ans3 = sc.Add("12,56");
        System.out.println(sc.GetCalledCount());
    }
}

class StringCalculator{
    private int count = 0;
    public int Add(String numbers){
        count++;
        if(numbers.isEmpty()){
            return 0;
        }
        String[] values = numbers.split("[, \n]+");
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
    }
    public int GetCalledCount(){
        return count;
    }
}
