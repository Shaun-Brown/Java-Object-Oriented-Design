package controlstructures;

public class GradeMark {

    public static void main(String[] args) {
        int mark;

        mark = 55;

        if (mark < 40) {
            System.out.println("Fail");
        } else if (mark < 60) {
            System.out.println("Pass");
        } else if (mark < 70) {
            System.out.println("Merit");
        } else if (mark > 70) {
            System.out.println("Distinction");
        } else {
            System.out.println("Error: You have entered an incorrect value");
        }
    }

}
