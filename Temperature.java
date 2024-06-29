import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter temperature");
        float temp = input.nextFloat();

       float Fahrenheit = temp * 9/5 +32;

        System.out.println("the fahrenheit is: " + Fahrenheit);

    }
}
