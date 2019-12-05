public class numberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

        if ((year < 1) || (year > 9999)) {
            System.out.println("false");
            return false;
        }
        if ((year % 400 == 0)  || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("true");
            return true;
        }else {
            System.out.println("false");
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {

        if ((month < 1 || month > 12) || (year < 1 || year >9999)){
            return -1;
        }
        switch(month){
            case 2:
                if (isLeapYear(year)){
                    return 29;
                }else {
                    return 28;
                }
            case 1: case 3: case 5: case 7: case 8: case 10 :case 12:{
                return 31;
            } default:
                return 30;

        }

    }





    }


