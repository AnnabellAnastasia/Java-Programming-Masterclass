package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ((temperature >= 25 ) && (temperature <= 35)){
            return true;
        } else if ((summer == true) && (temperature >= 25 ) && (temperature <= 45)){
            return true;
        } else {
            return true;
        }
    }


}
