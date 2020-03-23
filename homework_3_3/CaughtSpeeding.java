package src;

public class CaughtSpeeding {

    public static void main(String[] args) {
        // write your code here
        caughtSpeeding(86, true);
    }

    public static int caughtSpeeding(int speed, boolean isBirthday){
        if (speed >= 61 && speed <= 80 && !isBirthday || speed >= 66 && speed <= 85 && isBirthday){
            System.out.println("small ticket");
            return 1;
        }
        else if (speed >= 81 && !isBirthday || speed >=86 && isBirthday){
            System.out.println("big ticket");
        return 2;
        }
       else {
            System.out.println("no ticket");
            return 0;
        }
    }
}
