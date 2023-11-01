import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
    
        System.out.println("-----------------------------------");
        System.out.println(" Nakhon Pathom Vocational College");
        System.out.println(" Name : Phongsit Nakjan");
        System.out.println(" Nickname : Mak");
        System.out.println(" Student ID : 65309010014");
        System.out.println("-----------------------------------");

        Scanner scn = new Scanner(System.in);
        System.out.print(">>Enter your GPA : ");
        int num = scn.nextInt();
        scn.close();

        System.out.println("Result GPA : " + num);

        if (num<=49) {
            System.out.println("Grade : F");
        }else if (num<=59) {
            System.out.println("Grade : D");
        }else if (num<=69) {
            System.out.println("Grade : C");
        }else if (num<=79) {
            System.out.println("Grade : B");
        }else if(num<=100) {
            System.out.println("Grade : A");
        }else{
            System.out.println("Please enter score 1-100");
        }

        System.out.println("-----------------------------------");

    }
    
}