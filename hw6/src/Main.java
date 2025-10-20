import java.util.*;

public class Main {
    static Scanner infoTaker = new Scanner(System.in);
    static void smallestOfThree(){
        int [] numbers = new int[3];

        for (int i = 0; i < 3 ; i++) {
            System.out.print("input number:");
            numbers[i] = infoTaker.nextInt();
        }
        infoTaker.nextLine();
        int smallest = numbers[0];
        for (int i : numbers) {
            if(i < smallest){
                smallest =i;
            }
        }
        System.out.printf("the smallest value %d\n",smallest);

    }

    static String checkNumberStatus(){
        String numberStatus;
        System.out.print("input number:");
        int number = infoTaker.nextInt();
        infoTaker.nextLine();
        if(number >0){
            numberStatus = number + " is positive";
        } else if (number <0) {
            numberStatus = number + " is negative";
        } else numberStatus = number + " is zero";

        return numberStatus;
    }

    static String checkPassword(String password){
        String letters = "abcdefghijklmnopqrstuvwxyz01234567890";
        System.out.println(letters.length() +" " + letters.substring(26));
        int digitCounter = 0;
        if(password.length() <10){
            return "password not valid: (shorter than 10 elements) " +password;
        }
        for (int i = 0; i<password.length(); i++) {
            if(!letters.contains(password.toLowerCase().charAt(i)+"")){
                return "password not valid: " + password + " (banned char) " + password.charAt(i);
            }

            if(letters.substring(26).contains(password.toLowerCase().charAt(i)+"")){
                digitCounter++;
            }

        }
        if(digitCounter <2){
            return "password not valid: " + password + " (contains less than two digits) ";
        }
        return  "password is valid: " + password;
    }

    static void main() {
        smallestOfThree();
        System.out.printf("the number %s\n", checkNumberStatus());
        System.out.print("\n1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits\n" +
                "Input a password (You are agreeing to the above Terms and \n" +
                "Conditions.):  ");
        String password = infoTaker.nextLine();
        System.out.println(checkPassword(password));
    }
    }

