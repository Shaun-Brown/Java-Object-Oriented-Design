package main;

public class CompareStringDemo {

    public static void main(String[] args) {

        String s1 = "fred";
        String s2 = "Fred";
        if (s1.compareTo(s2) < 0 ) { // then s1 is before s2
            System.out.println(s1 + " is before " + s2);
        }
        else if (s1.compareTo(s2) == 0 ) { // then s1 and s2 same
            System.out.println(s1 + " is the same as " + s2);
        }
        else if (s1.compareTo(s2) > 0 ) { // then s1 is after s2
            System.out.println(s1 + " is after " + s2);
        }


    }

}
