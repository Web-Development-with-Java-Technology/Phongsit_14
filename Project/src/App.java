import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // System.out.println("Hello, World!");

        // String name = "Phongsit";
        // System.out.println("Name : " + name);

        // Scanner scn = new Scanner(System.in);
        // System.out.print("Enter your number : ");
        // int num = scn.nextInt();
        
        // Scanner sct = new Scanner(System.in);
        // System.out.print("Enter your text : ");
        // String text = sct.nextLine();

        // scn.close();
        // sct.close();

        // System.out.println(num);
        // System.out.println(text);

        // int num = 55;

        // System.out.println((num>=50)? "Pass" : "Fail");

        Scanner scn = new Scanner(System.in);
        System.out.print(">>Enter your Number : ");
        int num = scn.nextInt();
        scn.close();

        switch (num){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Please enter number1-7");
        }
    }
}