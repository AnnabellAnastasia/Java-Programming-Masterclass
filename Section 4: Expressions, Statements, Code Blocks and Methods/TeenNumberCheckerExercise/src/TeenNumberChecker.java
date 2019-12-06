public class TeenNumberChecker {

    public static boolean hasTeen(int firstTeen, int secondTeen, int thirdTeen) {

        if ((firstTeen >=13 && firstTeen <=19) || (secondTeen >=13 && secondTeen <=19) || (thirdTeen >=13 && thirdTeen <=19) ){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isTeen(int teen ) {
        if (teen >=13 && teen <=19) {
            return true;
        } else {
            return false;
        }
    }
}
