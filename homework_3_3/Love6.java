package src;

public class Love6 {

    public static void main(String[] args) {
        // write your code here
        love6(8,14);
    }

    public static boolean love6(int a, int b){
        if (a == 6 || b == 6 || a+b == 6 || a-b == 6 || b-a == 6){
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }
}
