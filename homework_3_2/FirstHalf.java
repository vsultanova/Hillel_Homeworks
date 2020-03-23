package src;

public class FirstHalf {

    public static void main(String[] args) {
        // write your code here
        firstHalf("string");

    }

    public static String firstHalf(String str){
        int letter = str.length();
        System.out.println(letter);

        int halfLetter = letter/2;
        System.out.println(halfLetter);

        String a = str.substring(0, halfLetter);
        System.out.println(a);

        return a;
    }
}

