package src;

public class BackAround {

    public static void main(String[] args) {
        // write your code here
        backAround("abcdefs");
    }

    public static String backAround(String str){
        int a = str.length();
        String b = str. substring(a-1);
        String c = b.concat(str);
        String d = c.concat(b);

            System.out.println(d);
            return d;
        }
}