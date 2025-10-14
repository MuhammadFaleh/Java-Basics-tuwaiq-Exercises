import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner infoTaker;

    public static void biggestNumChecker() {
        System.out.println("input a number");
    }

    static void main() {
        System.out.println("user types \n1-admin \n2-superuser\n3-user");
        System.out.print("enter the usertype:");
        String userType = infoTaker.nextLine();
        if (userType.equalsIgnoreCase("admin")) {
            System.out.println("welcome admin");
        } else if (userType.equalsIgnoreCase("superuser")) {
            System.out.println("welcome superuser");
        } else if (userType.equalsIgnoreCase("user")) {
            System.out.println("welcome user");
        } else {
            System.out.println("enter one from the list");
        }

        System.out.print("enter the first number:");
        int firstNum = infoTaker.nextInt();
        System.out.print("enter the second number:");
        int secondNum = infoTaker.nextInt();
        System.out.print("enter the third number:");
        int thirdNum = infoTaker.nextInt();
        if (firstNum > secondNum && firstNum > thirdNum) {
            System.out.printf("first is biggest :%d\n", firstNum);
        } else if (secondNum > firstNum && secondNum > thirdNum) {
            System.out.printf("second is biggest :%d\n", secondNum);
        } else if (thirdNum > firstNum && thirdNum > secondNum) {
            System.out.printf("third is biggest:%d\n", thirdNum);
        } else {
            System.out.println("no single biggest number");
        }

        Random numGenerator = new Random();
        int dayOfWeek = numGenerator.nextInt(1, 8);
        switch (dayOfWeek) {
            case 1 -> System.out.println("today is sunday");
            case 2 -> System.out.println("today is monday");
            case 3 -> System.out.println("today is tuesday");
            case 4 -> System.out.println("today is wednesday");
            case 5 -> System.out.println("today is thursday");
            case 6 -> System.out.println("today is friday");
            case 7 -> System.out.println("today is saturday");
        }

        System.out.print("please enter your grade: ");
        int grade = infoTaker.nextInt();
        if (grade >= 90 && grade <= 100) {
            System.out.println("your grade is A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("your grade is B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("your grade is C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("your grade is D");
        } else {
            System.out.println("your grade is F");
        }

        System.out.print("please enter your age: ");
        byte age = infoTaker.nextByte();
        if (age >= 13 && age <= 19) {
            System.out.println("Age group: teenager");
        } else if (age > 20) {
            System.out.println("Age group: adult");
        } else {
            System.out.println("Age group: child");
        }

    }

    static {
        infoTaker = new Scanner(System.in);
    }
}
