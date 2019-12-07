package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	getLargerPrime(21);
	getLargerPrime(217);

        getLargerPrime(0);

        getLargerPrime(45);

        getLargerPrime(-1);

    }

    public static int getLargerPrime(int number) {
            if (number < 2) {
                return -1;
            }
            for (int i = 2; i < number; i++) {
                if ((number % i) == 0) {
                    number /= i;
                    i--;
                }
            }
            return number;

    }
}
