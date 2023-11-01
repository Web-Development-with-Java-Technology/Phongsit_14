import java.util.Scanner;

public class FoodMenu {

    public static void main(String[] args) {
        
        System.out.println("-------Menu-------");
        System.out.println("1.Spaghetti");
        System.out.println("2.Green curry");
        System.out.println("3.Hamburger");
        System.out.println("4.Pizza");
        System.out.println("5.Sushi");
        System.out.println("------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print(">>Please enter number for select menu : ");
        int num = sc.nextInt();
        sc.close();

        switch (num){
            case 1 -> System.out.println("You select : Spaghetti");
            case 2 -> System.out.println("You select : Green curry");
            case 3 -> System.out.println("You select : Hamburger");
            case 4 -> System.out.println("You select : Pizza");
            case 5 -> System.out.println("You select : Sushi");
            default -> System.out.println("Please enter number1-5");
        }

    }
    
}