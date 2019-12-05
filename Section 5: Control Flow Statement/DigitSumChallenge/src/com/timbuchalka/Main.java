package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        sumDigits(125);
        sumDigits(521);
        sumDigits(56);
    }

    public static int sumDigits(int number){

        if (number <10){
            return -1;
        }

        int sum = 0;

        while (number > 0){
            int digit = number % 10;
            sum += digit;

            sum = sum + number % 10;
            number = number / 10;
//
            System.out.println(" summary is " + sum);
        }
        return sum;
    }
}
