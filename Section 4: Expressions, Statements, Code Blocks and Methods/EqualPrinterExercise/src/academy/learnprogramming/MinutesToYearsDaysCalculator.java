package academy.learnprogramming;

public class MinutesToYearsDaysCalculator {

    public static double main(String[] args) {
        System.out.println(printYearsAndDays(525600));


    }
    public static double printYearsAndDays(long minutes) {
        if (minutes < 0){
            System.out.println("Invalid value!");;
        }else{
            double hour = minutes * 60;
            double day = hour * 24;
            double year = day * 365;
            System.out.println(minutes + " min = " + year + " y and " + day + " d");
            return
        }
    }


}





