package com.timbuchalka;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	hasSameLastDigit(41,22,71);
	hasSameLastDigit(23,32,42);
	hasSameLastDigit(9,99,999);

	isValid(10);
	isValid(468);
	isValid(1051);
    }

    public static boolean hasSameLastDigit (int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c)){
            return false;
        }
        int rightmosta=a%10;
        int rightmostb=b%10;
        int rightmostc=c%10;

        return rightmosta == rightmostb || rightmosta == rightmostc || rightmostb == rightmostc;

    }


    public static boolean isValid(int number) {
        return number>9 && number<1001;
    }
}
