package src;

public class MissingChar {

    public static void main(String[] args) {
        // write your code here
        missingChar("string", 5);
    }

    public static String missingChar(String str, int n){
        int a = str.length();
        if (n==0){
            String b = str.substring(1);
            System.out.println(b);
            return b;
        }
        else if (n==a-1){
            String c = str.substring(0, a-1);
            System.out.println(c);
            return c;
        }
        else {
            String d = str.substring(0,n);
            String e = str.substring(n+1, a);
            String f = d.concat(e);
            System.out.println(f);
            return f;
        }

    }
}