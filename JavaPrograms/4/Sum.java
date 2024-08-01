import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);

       int ans =  sum3(2, 4);
        System.out.println(ans);

    }
    // pass the value of numbers when you are calling the method in main()

    static  int sum3(int a, int b){
        int sum = a+b;
        return sum;

    }

    //return the value
    static  int sum2() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter Number 2: ");

        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println(sum);

        return sum;

    }

       static void sum(){
            Scanner input = new Scanner(System.in);

           System.out.println("Enter Number 1: ");
           int num1 = input.nextInt();
           System.out.println("Enter Number 2: ");

           int num2 = input.nextInt();

           int sum = num1 + num2;

            System.out.println(sum);


    }
}
