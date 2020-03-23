package src;

public class ConCat {

    public static void main(String[] args) {
        // write your code here
conCat("rrrrrlk5", "5555");
    }

    public static String conCat(String a, String b){
        int x = a.length();
        int z = b.length();

        if (x > 0 && z > 0) {
            String last = a.substring((x-1));
            System.out.println(last);

            String first = b.substring(0,1);
            System.out.println(first);

            if (first.equals(last)) {
                String new1 = a.substring(0, x - 1).concat(b);
                System.out.println(new1);
                return new1;
            } else {
                String new2 = a.concat(b);
                System.out.println(new2);
                return new2;
            }
        }
        else {
            String new3 = a.concat(b);
            System.out.println(new3);
            return new3;
        }
    }
}
