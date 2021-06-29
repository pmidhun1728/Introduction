package com.spring.unittesting.unittesting;

import com.spring.unittesting.unittesting.prime.SomeBusinessImplement;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessTest {

    @Test
    public void CalculateSum_basic(){
        SomeBusinessImplement si = new SomeBusinessImplement();
        int actualResult = si.calculateSum(new int[] {1,2,3});
        int expectedResult=6;
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void CalculateSum_empty(){
        SomeBusinessImplement si = new SomeBusinessImplement();
        int actualResult = si.calculateSum(new int[] {});
        int expectedResult=0;
        assertEquals(expectedResult, actualResult);

    }

}
