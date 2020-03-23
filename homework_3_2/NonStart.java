package src;

public class NonStart {

    public static void main(String[] args) {

nonStart("123", "qws");
    }

    public static String nonStart(String a, String b){
        String newWord1 = a.substring(1);
        System.out.println(newWord1);

        String newWord2 = b.substring(1);
        System.out.println(newWord2);

        String newWord3 = newWord1.concat(newWord2);
        System.out.println(newWord3);
        return newWord3;
    }
}

