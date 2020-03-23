package src;

public class Diff21 {

    public static void main(String[] args) {
        // write your code here
        diff21(-5);
    }

    public static int diff21(int n){
        if (n >= 21){
            int a = (n - 21) * 2;
            System.out.println(a);
            return a;
        }
        else if (n < 0){
            int b = 21 + Math.abs(n);
            System.out.println(b);
            return b;
        }
        else {
            int c = 21 - n;
            System.out.println(c);
            return c;
        }
    }
}
