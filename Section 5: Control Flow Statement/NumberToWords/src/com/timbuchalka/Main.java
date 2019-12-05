package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	getDigitCount(0);
	getDigitCount(123);
	getDigitCount(-12);
	getDigitCount(5200);

	reverse(-121);
	reverse(2121);
	reverse(1234);
	reverse(100);

	numbersToWords(123);
	numbersToWords(1010);
	numbersToWords(1000);
	numbersToWords(-12);

    }

    public static void numbersToWords(int numbers) {
        if (numbers<0){
            System.out.println("Invalid number");

        }
    }

    public static void reverse(int number) {

    }

    public static int getDigitCount(int number) {
        if (number<0){
            System.out.println("-1");
            return -1;
        }
        return number;
    }
}
