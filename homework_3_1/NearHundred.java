package src;

public class NearHundred {

    public static void main(String[] args) {
        // write your code here
        nearHundred(211);
    }

    public static boolean nearHundred(int n){
        if (n >= 90 && n <= 110 || n >= 190 && n <= 210){
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }
}
