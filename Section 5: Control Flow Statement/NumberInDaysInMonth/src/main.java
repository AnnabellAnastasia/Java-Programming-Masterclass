public class main {
    public static void main(String[] args) {
        numberOfDaysInMonth.isLeapYear(-1600);
        numberOfDaysInMonth.isLeapYear(1600);
        numberOfDaysInMonth.isLeapYear(2017);
        numberOfDaysInMonth.isLeapYear(2000);

        numberOfDaysInMonth.getDaysInMonth(1,2020);
        numberOfDaysInMonth.getDaysInMonth(2,2020);
        numberOfDaysInMonth.getDaysInMonth(2,2018);
        numberOfDaysInMonth.getDaysInMonth(-1,2018);
        numberOfDaysInMonth.getDaysInMonth(1,-2020);

    }
}
