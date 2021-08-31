package com.cybertek.day11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedTestInJunit5 {


        @ParameterizedTest
        @ValueSource(ints = {1,3,5,6,7,9,10,5,21,32})
        public void testMultipleNumbers(int number){

         System.out.println("number = " + number);
                Assertions.assertTrue(number > 5);

        }

        @ParameterizedTest
        @ValueSource(strings = {"john","abbas","ali","TJ"})
        public void testMultipleNames(String name){
            System.out.println("name = " + name);

        }



}