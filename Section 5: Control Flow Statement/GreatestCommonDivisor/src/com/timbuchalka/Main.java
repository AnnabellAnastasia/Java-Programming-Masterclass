package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	getGreatestCommonDivisor(25,15);
	getGreatestCommonDivisor(12,30);
	getGreatestCommonDivisor(9,18);
	getGreatestCommonDivisor(81,153);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second <10)
            return-1;
        while (first != second){
            if (first > second){
                first=first-second;
            }else {
                second=second-first;
            }
                    }
        return first;
    }

}