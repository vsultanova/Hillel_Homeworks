package src;

public class TwoAsOne {

    public static void main(String[] args) {
        // write your code here
twoAsOne(9,3,5);
    }
    public static boolean twoAsOne(int a, int b, int c){
        if (a + b == c || a + c == b || b + c == a){
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }

}