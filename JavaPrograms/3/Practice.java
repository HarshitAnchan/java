/* Write a program to read gender and print the
    corresponding gender using switch statement */

//import java.util.Scanner;
//
//public class Practice {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        String gender = input.next();
//
//        switch(gender){
//
//            case "M" :
//            case "m" :
//                System.out.println("Male");
//                break;
//
//
//            case "F":
//            case "f":
//                System.out.println("Female");
//                break;
//
//            default:
//                System.out.println("invalid input");
//        }
//
//    }
//}



/*  Write a program to Check whether the number
is even or odd using switch statement  */


//import java.util.Scanner;
//
//public class Practice {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        int num = input.nextInt();
//        switch(num % 2 ){
//
//            case 0 :
//                System.out.println("even");
//                break;
//            case 1:
//                System.out.println("odd");
//                break;
//
//
//        }
//
//    }
//}


/* Write a program to print remark according
to the grade obtained using switch statement */

//import java.util.Scanner;
//
//public class Practice {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("A, B, C, D, E, F");
//
//        String grade = input.next();
//
//        switch(grade){
//
//            case "A":
//                System.out.println("Excellent");
//                break;
//            case "B":
//                System.out.println("well done");
//                break;
//            case "C":
//                System.out.println("very good");
//                break;
//            case "D":
//                System.out.println("Good");
//                break;
//            case "E":
//                System.out.println("Bad");
//                break;
//            case "F":
//                System.out.println("Fail");
//                break;
//        }
//    }
//}


//Write a program to check whether a
// person is eligible to vote or Not using
// switch statement


import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age = input.nextInt();

        int isEligible = age >= 18 ? 1 : 0 ;

        switch(isEligible){

            case 1:
                System.out.println("You are eligible");
                break;
            case 0:
                System.out.println("You are not eligible");
                break;

        }

    }
}








