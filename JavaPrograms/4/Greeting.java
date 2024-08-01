public class Greeting {
    public static void main(String[] args) {
//    String message = greeting();
//
//        System.out.println(message);

        String personalised = myGreet("Harshit Anchan");
        System.out.println(personalised);
    }
      static String myGreet(String name) {

        String message = "hello "+ name;

        return message;
    }

//    static String greet(){
//        String greeting = "hello";
//        return greeting;
//    }
}
