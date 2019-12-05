package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
    }

    public static int getEvenDigitSum(int number){
        if(number <0){return -1;}
        int evenNumber = 0;
        int digit =0;
        while(number !=0){
            digit = number % 10;
            if(digit %2 == 0) {
                evenNumber = digit + evenNumber;
                number = number / 10;
            }else{
                number = number / 10;
                continue;
            }

        }
        System.out.println(evenNumber);
        return evenNumber;
    }
}
