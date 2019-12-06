package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        canPack(1,0,4);
        canPack(1,0,5);
        canPack(0,5,4);
        canPack(2,2,11);
        canPack(-3,2,12);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount <0 || goal <0){
            System.out.println("false, because count is negative");
            return false;
        }else if ((5*bigCount + smallCount)< goal){
            return false;
        }else if (goal % 5 > smallCount){
            System.out.println("false because goal less then sum");
            return false;

        }

return true;
    }
}
