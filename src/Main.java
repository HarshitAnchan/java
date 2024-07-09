
//Write a program to sum three numbers in Java.
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter numbers");
//      int num1 =  input.nextInt();
//      int num2 =  input.nextInt();
//      int num3 =  input.nextInt();
//
//      int sum = num1+num2+num3;
//
//        System.out.println(sum);
//
//
//    }
//}

//Write a program to calculate CGPA using marks of three subjects (out of 100)

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int sub1 = input.nextInt();
//        int sub2 = input.nextInt();
//        int sub3 = input.nextInt();
//
//        int credit1 = input.nextInt();
//        int credit2 = input.nextInt();
//        int credit3 = input.nextInt();
//
//
//
//
//        int totalgradepoint = (sub1*credit1) + (sub2*credit2) + (sub3*credit3);
//        int totalcredit = credit1+credit2+credit3;
//
//        double cgpa= totalgradepoint/totalcredit;
//
//        System.out.println(cgpa);
//
//    }
//}
//

//Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.

//import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name");
//       String name =  input.next();
//       if(name.equalsIgnoreCase("Harshit") ){
//           System.out.println("Hello " + name);
//       }
//
//    }
//}


//Write a Java program to convert Kilometers to miles.
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        System.out.println("Enter the km");
//
//        Scanner input = new Scanner(System.in);
//
//        float distanceInKm = input.nextFloat();
//
//         float distanceInMiles = distanceInKm/1.6f;
//
//        System.out.println("You have covered "+ distanceInMiles+" miles");
//    }
//}


//Write a Java program to detect whether a number entered by the user is an integer or not.

//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        if(input.hasNextInt()){
//            int num = input.nextInt();
//            System.out.println(num+"  is an integer");
//        }else{
//            String name = input.next();
//            System.out.println(name+"  is not a integer");
//        }
//    }
//}
//
//





//. Write a program to find maximum between two numbers

//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("ENTER TWO NUMBER");
//        int num1 = input.nextInt();
//        int num2 =   input.nextInt();
//
//      if(num1 > num2){
//          System.out.println("Largest number is " + num1);
//
//      }else {
//          System.out.println("Largest number is " + num2);
//      }
//
//
//    }
//}



//        2. Write a program to find maximum between three numbers

//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int num1 = input.nextInt();
//        int num2  = input.nextInt();
//        int num3  = input.nextInt();
//
//        int max = num1;
//
//        if (num2 > max){
//            max = num2;
//        }if(num3 > max){
//            max = num3;
//        }
//
//        System.out.println("max number is "+ max);
//
//
//
//    }
//}


//        3. Write a program to check whether a number is negative, positive or zero


import java.util.Scanner;

//public class Main{
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//       int num =  input.nextInt();
//
//       if(num >0){
//           System.out.println("IT is +ve");
//       }if (num< 0 ) {
//            System.out.println("It is -ve");
//        }if (num ==0){
//            System.out.println(" it is 0");
//        }
//}}

//4. Write a program to check whether a number is divisible by 5 and 11 or not
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//
//
//        if(num%5==0 && num%11==0){
//            System.out.println("the number is divisible  by 11 and 5 ");
//        }else{
//            System.out.println("the number is not divisible");
//        }
//
//    }
//}

//5. Write a program to check whether a number is even or odd

//public class Main{
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        int num = input.nextInt();
//
//        if (num%2 == 0){
//            System.out.println("number is even");
//        }else{
//            System.out.println("number is odd");
//        }
//    }
//}

//

