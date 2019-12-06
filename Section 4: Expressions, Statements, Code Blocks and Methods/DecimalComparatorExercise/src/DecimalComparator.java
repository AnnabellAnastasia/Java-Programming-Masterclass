public class DecimalComparator {


    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber){
        firstNumber = firstNumber *1000;
        secondNumber =secondNumber *1000;

        System.out.println( firstNumber);
        System.out.println(secondNumber);

        if ((int)firstNumber == (int)secondNumber){
            return true;
        }else {
            return false;
        }
    }
}







