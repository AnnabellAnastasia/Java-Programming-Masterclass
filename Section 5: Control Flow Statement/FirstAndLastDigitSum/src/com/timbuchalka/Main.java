package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
    sumFirstAndLastDigit(252);
    sumFirstAndLastDigit(257);
    sumFirstAndLastDigit(0);
    sumFirstAndLastDigit(5);
    sumFirstAndLastDigit(-10);

    }

    public static int sumFirstAndLastDigit(int number) {
            if(number<0)
                return -1;
            int first=number%10;
            while(number>9)
                number/=10;
            return first+number;
        }
    }


