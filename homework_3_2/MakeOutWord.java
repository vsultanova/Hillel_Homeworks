package src;

public class MakeOutWord {

    public static void main(String[] args) {
        // write your code here
makeOutWord("<<<<>>>", "hello");

    }

    public static String makeOutWord(String out, String word){
        int letter = out.length();
        System.out.println(letter);

        int halfLetter = letter/2;
        System.out.println(halfLetter);

        String a = out.substring(0, halfLetter);
        System.out.println(a);

        String b = out.substring(halfLetter, letter);
        System.out.println(b);

        System.out.println(a+word+b);
        return (a + word + b);
    }
}