import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");

        int Salary =  input.nextInt();

//        if(Salary > 10000){
//            Salary = Salary + 2000;
//        }else {
//            Salary = Salary + 1000;
//        }







        if(Salary > 10000){
            Salary+= 2000;
        } else if (Salary>20000) {
            Salary+=3000;
        }else {
            Salary+= 1000;
        }
        System.out.println(Salary);

    }
}