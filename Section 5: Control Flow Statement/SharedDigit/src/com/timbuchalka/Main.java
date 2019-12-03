package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        hasSharedDigit(12, 23);
        hasSharedDigit(9, 99);
        hasSharedDigit(15, 55);
    }


        public static boolean hasSharedDigit(int a, int b) {
            if (a < 10 || a > 99 || b < 10 || b > 99) {
                return false;
            }
            int lastDigitA, lastDigitB;
            while (a > 0) {
                lastDigitA = a % 10;
                while (b > 1) {
                    lastDigitB = b % 10;
                    if (lastDigitA == lastDigitB) {
                        return true;
                    }
                    b /= 10;
                }
                if (lastDigitA == b) {
                    return true;
                }
                a /= 10;
            }
            return false;
        }
    }

