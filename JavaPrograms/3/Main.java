import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        String fruit = input.next();

//        switch (fruit) {
//            case "mango" -> System.out.println("king of fruits");
//            case "apple" -> System.out.println("a sweet red fruit");
//            case "orange" -> System.out.println("round fruit");
//            case "grapes" -> System.out.println("small fruit");
//            default -> System.out.println("please enter a valid fruit");
//        }

        int day = input.nextInt();
        switch (day) {

            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Sat");
            case 7 -> System.out.println("Sunday");

        }

    }
}