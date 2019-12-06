public class LeapYearCalculator {


    public static boolean isLeapYear (int year) {



        if ((year <= 1) || (year >= 9999)) {
            return false;
        } else if (year % 400 == 0 && year % 4 == 0 && year % 100 == 0) {
            return true;

            // Years that are divisible by 4 and not divisible by 100 are leap years
        } else if (year % 4 == 0 && year % 100 != 0){
                return true;
            }
return false;
        }

    }