package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int counter = 0;

        while(true){
            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();

                sum += number;
                ++counter;


            }else {
                break;
            }

            scanner.nextLine();//Handle the input.

        }

        avg = Math.round((double) sum / counter);
        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }

}
