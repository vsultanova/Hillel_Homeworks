package src;

public class TeaParty {

    public static void main(String[] args) {
        // write your code here
        teaParty(3,8);
    }

    public static int teaParty(int tea, int candy){
        if (tea >= 2 * candy && tea >= 5 && candy >= 5
                || candy >= 2 * tea && tea >= 5 && candy >= 5) {
            System.out.println("great");
            return 2;
        }
        else if (tea >= 5 && candy >= 5) {
            System.out.println("good");
            return 1;
        }
        else {
            System.out.println("bad");
            return 0;
        }
    }
}
