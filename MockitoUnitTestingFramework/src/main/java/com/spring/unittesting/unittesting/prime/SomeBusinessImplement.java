package com.spring.unittesting.unittesting.prime;

public class SomeBusinessImplement {

    public int calculateSum(int[] data){
        int sum=0;
        for(int value:data){
            sum+=value;
        }
        return sum;
    }
}
