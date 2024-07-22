import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int employid = input.nextInt();

        String department = input.next();

        switch(employid) {
            case 1 :
                System.out.println("harshit ");
                break;
            case 2 :
                System.out.println("darshan jain");
                break;
            case 3 :
                switch(department) {
                    case "IT":
                        System.out.println("it deparment");
                        break;
                    case "Management":
                        System.out.println("mangement department");
                        break;
                    default:
                        System.out.println("no deparment");
                }
                break;
            default:
                System.out.println("enter valid emplo id");
        }
    }
}
