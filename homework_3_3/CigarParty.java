package src;

public class CigarParty {

    public static void main(String[] args) {
        // write your code here
        cigarParty(61, false);
    }

    public static boolean cigarParty(int cigars, boolean isWeekend){

        if (cigars >= 40 && cigars <= 60 && !isWeekend){
            System.out.println("true");
            return true;
        }
        else if(cigars >= 40 && isWeekend) {
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }
}