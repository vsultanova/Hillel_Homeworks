package src;

public class SleepIn {

    public static void main(String[] args) {
        // write your code here
        sleepIn(false, true);
    }

    public static boolean sleepIn(boolean weekday, boolean vacation){
        if (!weekday || vacation){
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
        return false;
        }
    }
}