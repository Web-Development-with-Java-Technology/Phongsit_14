import java.util.Scanner;

public class CalculateNumber {
    public static void main(String[] args) {

        System.out.println("-----------------------------------");
        Scanner scn1 = new Scanner(System.in);
        System.out.print(">>Enter your Number1 : ");
        int num1 = scn1.nextInt();

        Scanner scn2 = new Scanner(System.in);
        System.out.print(">>Enter your Number2 : ");
        int num2 = scn2.nextInt();
        scn1.close();
        scn2.close();
        
        System.out.println("-----------------------------------");
        System.out.println("**RESULT**");
        System.out.println("A+B = " + (num1+num2));
        System.out.println("A-B = " + (num1-num2));
        System.out.println("A*B = " + (num1*num2));
        System.out.println("A/B = " + (num1/num2));
        System.out.println("-----------------------------------");

    }
}
