package src;

public class StartHi {

    public static void main(String[] args) {
        // write your code here
        startHi("");

    }

    public static boolean startHi(String str){
        int a = str.length();

        if (a>=2) {
            String c = "hi";
            String b = str.substring(0, 2);

            if (b.equals(c)) {
                System.out.println("true");
                return true;
            } else {
                System.out.println("false");
                return false;
            }
        }
        else {
            System.out.println("false");
            return false;
        }
    }
}
