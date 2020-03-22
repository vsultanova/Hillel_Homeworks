package src;

public class Main {

    public static void main(String[] args) {
        // write your code here
        sum(3, 3);
    }
    public static int sum(int a, int b){
            int x;
            if (a == b)
            {
                x = (a + b ) * 2;
                System.out.println("My double sum = " + x);
            }
            else
            {
                x = a + b;
                System.out.println("My sum = " + x);
            }
            return x;
        }

}
