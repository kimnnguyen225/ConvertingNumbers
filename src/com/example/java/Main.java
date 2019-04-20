package com.example.java;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("The 1st value is: " + intValue1);
        System.out.println("The 2nd value is: " + intValue2);

        long longValue1 = intValue1;
        System.out.println("The long value is: " + longValue1);

        short shortValue1 = (short) intValue1;
        System.out.println("The short value is: " + shortValue1);

        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("The byte value is: " + byteValue);

        double doubleValue = 3.999999d;
        int intValue4 = (int) doubleValue;
        System.out.println("Double to int: " + intValue4);

        double result1 = (double) intValue3 / doubleValue;
        System.out.println("Int divided double = " + result1);

        double result2 = (double) intValue3 % doubleValue;
        System.out.println("To get remainder in double: Int % Modulus Double = " + result2);

        int result3 = (int) ((int) intValue3 % doubleValue); // remainder 0.56, cast to int, result will be 0
        System.out.println("To get remainder in int: Int % Modulus Double = " + result3);

        double doubleValue1 = -3.99999;
        long rounded = Math.round(doubleValue1);
        System.out.println("Division: " + rounded);

        double absValue = Math.abs(doubleValue1);
        System.out.println("Absolute: " + absValue);

    }
}
