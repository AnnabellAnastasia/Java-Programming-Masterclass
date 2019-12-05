package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
    sumOdd(1,100);
    sumOdd(-1,100);
    sumOdd(100,100);
    sumOdd(13,13);
    sumOdd(100,-100);
    sumOdd(100,1000);

    }

    public static boolean isOdd(int number) {
        if ((number <= 0) || (number % 2 == 0)) {
            return false;
        }else {
            return true;
        }
    }


    public static int sumOdd(int start, int end) {
        int sum = 0;

        if ((end <= 0) || (end <=0) || (end <= start)){
            return -1;
        } else{
            for (int i = start; i <= 0; i++) {
                if (isOdd(i)){
                    sum +=1;
                }
            }
            return sum;
        }
    }
}
