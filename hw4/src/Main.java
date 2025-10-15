import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner infoTaker = new Scanner(System.in);

    static void main() {
        // first task
        for (int i = 1; i <=100 ; i++) {
            if (i %3 == 0 && i %5 == 0){
                System.out.printf("FizzBuzz the number is: %d\n", i);
            }else if(i %5==0){
                System.out.printf("Buzz the number is: %d\n", i);
            }else if(i %3==0){
                System.out.printf("fizz the number is: %d\n", i);
            }
        }
        //

        //second task
        System.out.print("\nenter a sentence to reverse: ");
        String userSentence = infoTaker.nextLine();
        StringBuilder sentenceReversed = new StringBuilder(userSentence).reverse(); // if i am allowed to use it
        System.out.println(sentenceReversed);

        String reversed = "";
        for (int i = userSentence.length() - 1; i >=0; i--) {  //if not
            reversed += userSentence.charAt(i);
        }
        System.out.println(reversed);
        //

        //third task
        System.out.print("\nenter a number to find the factorial for: ");
        int userNumberFactorial = infoTaker.nextInt();
        int factorialResult = 1;
        for (int i = userNumberFactorial; i >=1 ; i--) {
            factorialResult *=i;
        }
        System.out.printf("the factorial result of %d = %d\n",userNumberFactorial, factorialResult);
        //

        //forth task
        System.out.print("\nenter the base number: ");
        int userNumberBase = infoTaker.nextInt();
        System.out.print("enter the power: ");
        int userNumberPow = infoTaker.nextInt();
        int PowResult = 1;

        for (int i = 0; i < userNumberPow ; i++) {
            PowResult *=userNumberBase;
        }
        System.out.printf("the result of %d^%d = %d\n" , userNumberBase, userNumberPow, PowResult);
        //

        //fifth task
            int userChoice =0;
            int userNumberSum = 0;
            int resultEven =0;
            int resultOdd = 0;
            boolean loopEndFlag = false;
            while(!loopEndFlag){

                System.out.println("\npick one from the menu:\n1- input numbers to sum \n2- end and show result");
                userChoice = infoTaker.nextInt();

                switch (userChoice){
                    case 1:
                        System.out.print("enter the number:");
                        userNumberSum = infoTaker.nextInt();
                        if (userNumberSum %2 ==0){
                            resultEven += userNumberSum;
                        }else{
                            resultOdd += userNumberSum;
                        }
                        break;

                    case 2:
                        System.out.printf("the even sum = %d\nthe odd sum = %d\n", resultEven, resultOdd);
                        loopEndFlag = true;
                        break;

                    default:
                        System.out.println("pick one from the menu please");
                        break;
                }
            }
        //

        //sixth task

        /* method i used is trial division method
        * steps i found online:
        * Trial division method checks divisibility from 2 up to the square root of the number.
        * If the number is divisible by any of these, it is not prime.

        * // prime examples 2 3 5 7 29 31 to test
        * // none primes 1263 , 91, 1
        * */
        System.out.print("\nenter a positive number to check if prime:");
        int userNumberPrime = infoTaker.nextInt();
        infoTaker.nextLine(); // buffer clear
        int numFactors = 0;
        if (userNumberPrime > 1){ // 1 is not a prime number so are negatives so we skip them
            for (int i = 2; i < Math.sqrt(userNumberPrime) ; i++) {
                if(userNumberPrime % i == 0 ){
                    numFactors +=1;
                }
            }
            if (numFactors > 0){
                System.out.printf("%d is not a prime", userNumberPrime);
            }else System.out.printf("%d is a prime", userNumberPrime);
        }else{
            System.out.println("the number is either 1 or a negative and can't be prime");
        }




        //

        //seventh task
        for (int i = 1; i <= 4 ; i++) {
            System.out.printf("\nWeek %d\n\n", i);
            for (int j = 1; j <= 7 ; j++) {
                System.out.printf("Day%d\n\n", j);
            }
        }
        //

        //eighth task

        System.out.print("\nwrite a word to check if palindrome: ");
        userSentence = infoTaker.nextLine();
        reversed = "";
        for (int i = userSentence.length() - 1; i >=0; i--) {  //if not
            reversed += userSentence.charAt(i);
        }
        if(reversed.equalsIgnoreCase(userSentence)){
            System.out.printf("%s is palindrome", reversed);
        }else {
            System.out.printf("%s is not palindrome", reversed);
        }

        //
    }
}


