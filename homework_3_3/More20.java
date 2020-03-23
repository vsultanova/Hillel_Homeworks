package src;

public class More20 {

    public static void main(String[] args) {
        // write your code here
        more20(65);
    }

    public static boolean more20(int n){
        if (n % 20 == 2 || n % 20 == 1){
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }
}