package strings;

public class StringArrayDemo {

    public static void main(String[] args) {

//        String[] fruit = new String[6];
//
//        fruit[0] = "Grape";
//        fruit[1] = "Banana";
//        fruit[2] = "Apple";
//        fruit[3] = "Peach";
//        fruit[4] = "Mango";
//        fruit[5] = "Cherry";

        String[] fruit = {"Grape", "Mango", "Banana", "Apple", "Peach", "Orange", "Cherry", "Dragon Fruit"};

        System.out.println(fruit[3] + "'s are my favourite fruit");

        for (String s : fruit) {
            System.out.println(s.toUpperCase());
        }

        System.out.println("\n");

        int j = 0;
        while(j<fruit.length) {
            System.out.println(fruit[j].toUpperCase());
            j++;
        }

    }

}
