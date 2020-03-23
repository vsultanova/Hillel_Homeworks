package src;

public class TheEnd {

    public static void main(String[] args) {
        // write your code here
        theEnd("tester", false);
    }

    public static String theEnd(String str, boolean front){

        int z = str.length();
        if (front){
            String a = str.substring(0,1);
            System.out.println(a);
            return a;
        }
        else {
            String b = str.substring(z-1);
            System.out.println(b);
            return b;
        }
    }
}
