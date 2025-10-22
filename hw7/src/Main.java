import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    static Scanner infoTaker = new Scanner(System.in);
    static  DecimalFormat dFormat;

    static int inputNumbers(String name){
        int number = 0;
        boolean valid = false;
        while(!valid){
            try {
                System.out.printf("%s: ", name);
                number = infoTaker.nextInt();
                infoTaker.nextLine();

                valid = true;
            } catch (InputMismatchException e){
                infoTaker.nextLine();
                System.out.println("please enter a whole number like 0, 1, 2\n");


            }}
        return number;
    }

    static String inputString(String name){
        String word = "";
        boolean valid = false;
        while(!valid){
            try {
                System.out.printf("enter the %s : ", name);
                word = infoTaker.nextLine();
                if(word.length() == 0){
                   throw new Exception("please enter a word the entered word is empty");
                }valid = true;
            } catch (Exception e){
                System.out.println(e.getMessage());

            }
        }
        return word;
    }

    static double inputNumberDouble(String name){
        double number = 0;
        boolean valid = false;
        while(!valid){
            try {
                System.out.printf("%s: ", name);
                number = infoTaker.nextDouble();
                infoTaker.nextLine();
                valid = true;
            } catch (InputMismatchException e){
                infoTaker.nextLine();
                System.out.println("please enter a whole number like 0, 1, 2\n");


            }}
        return number;
    }

    static String divisionModZeroCheck(double firstNumber, double secondNumber, String decimalPoint, String arithmetic){
        double result = 0;
        dFormat = new DecimalFormat(decimalPoint);
        try {
            if(secondNumber == 0){
                throw new ArithmeticException(String.format("%s %s %s = undefined can't denominator be zero",
                        dFormat.format(firstNumber),arithmetic, dFormat.format(secondNumber)));
            } if(arithmetic.equalsIgnoreCase("%")){
                result = firstNumber % secondNumber;
            } else if (arithmetic.equalsIgnoreCase("/")){
                result = firstNumber / secondNumber;
            }
        }catch (ArithmeticException e){
            return e.getMessage();
        }


        return String.format("%s %s %s = %s", dFormat.format(firstNumber),
                dFormat.format(secondNumber), arithmetic, dFormat.format(result));
    }

    static void isZero(double number) throws Exception {
        if(number == 0){
            throw new Exception("please enter a number that is not zero");
        }
    }

    static void applyOpsNumber(){
        int firstNum;
        int secondNum;
        System.out.println("this program will do: \n1-addition + \n2-multiply *" +
                "\n3-subtract - \n4-divide /\n5-reminder mod");
        firstNum = inputNumbers("enter the first number");
        secondNum = inputNumbers("enter the second number");

        System.out.printf("%d + %d = %d\n", firstNum, secondNum, (firstNum+secondNum));
        System.out.printf("%d - %d = %d\n", firstNum, secondNum, (firstNum-secondNum));
        System.out.printf("%d x %d = %d\n", firstNum, secondNum, (firstNum*secondNum));
        System.out.println(divisionModZeroCheck(firstNum, secondNum, "0", "/"));
        System.out.println(divisionModZeroCheck(firstNum, secondNum, "0", "%"));

    }

    static void multiplicationTable(){

        int userNum = inputNumbers("enter the number to find the multiplication table");

        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d x %d = %d\n", userNum, i, (userNum*i));
        }


    }

    static void findCircleArea(){
        final double bi = (22.0/7.0);
        double radius = inputNumberDouble("enter the radius of the circle");
        double perimeter = 2.0*(bi)*radius;
        double area = bi*(Math.pow(radius, 2));
        System.out.printf("Perimeter is = %.1f\nArea is =%.1f\n\n", perimeter, area);

        // searched for negative and zero radius both can happen and be true mathematically
    }

    static void avgSum(){

        int countNumbers = inputNumbers("enter the count of numbers");
        int userNumbers = 0;
        try {
            if(countNumbers <= 0){
                throw new Exception("please enter numbers to find the average for");
            }

            for (int i = 0; i < countNumbers ; i++) {
                userNumbers += inputNumbers("enter an integer number");
            }

            System.out.printf("\nThe average is = %s\n",
                    divisionModZeroCheck(userNumbers, countNumbers, "0.00", "/"));

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    static void findSumThree(){
        boolean resultSum = true;
        int firstNum = inputNumbers("enter the first number");
        int secondNum = inputNumbers("enter the second number");
        int thirdNum = inputNumbers("enter the third number");

        try {
            if(thirdNum != (secondNum + firstNum)){
                resultSum = false;
                throw new Exception(String.format("\n\n%b the result is not equal\n", resultSum));
            }else System.out.printf("\n\n%b the result is not equal\n", resultSum);;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void reverseWord(){
        String userWord = inputString("a word to reverse");
        StringBuilder builder = new StringBuilder(userWord);

        String reversedWord = builder.reverse().toString();

        System.out.printf("Reverse word: %s\n", reversedWord);
    }

    static void evenOdd(){
        int number = inputNumbers("enter a number to find if even or odd");
        try {
            isZero(number);
            if(number %2 ==0){
                System.out.println("the number is even");
            }else {
                System.out.println("the number is odd");
            }
        }catch (Exception e){
            System.out.println("number is a zero");
        }
    }

    static void TempCenToFah(){
        double userTempC = inputNumberDouble("enter the temperature in Centigrade");
        double tempF = userTempC *1.8 +32.0;
        System.out.printf("Temperature in Fahrenheit is: %.1f\n",tempF);
    }

    static void charAtIndex(){
        String userWord = inputString("word to index");
        System.out.print("");
        int userIndex = inputNumbers("Input an index to find the character");

        try {
            System.out.printf("the letter for index %d is: %s\n", userIndex, userWord.charAt(userIndex));
        }catch (StringIndexOutOfBoundsException e){
            System.out.printf("the index %d is: longer or shorter then the word\n",
                    userIndex);
        }

    }

    static void rectangleArea(){
        double rectangleWidth = inputNumberDouble("Input rectangle width");
        double rectangleHeight = inputNumberDouble("Input rectangle height");
        try {
            if(rectangleHeight == rectangleWidth){
                throw new Exception("this is a square not a rectangle");
            }
            System.out.printf("Area is %.1f * %.1f = %.2f\n" +
                            "Perimeter is %.1f * (%.1f + %.1f) = %.2f",rectangleWidth, rectangleHeight,
                    rectangleHeight * rectangleWidth,2.0,rectangleWidth,rectangleHeight,
                    2.0*(rectangleHeight + rectangleWidth));
        }catch (Exception e){
            System.out.printf("%s Area = %.2f\n" +
                            "Perimeter = %.2f",e.getMessage(),rectangleWidth * rectangleHeight,
                    rectangleHeight * rectangleWidth);
        }

    }

    static void compareNumber(){
        int firstNum = inputNumbers("enter the first number to compare");
        int secondNum = inputNumbers("enter the second number to compare");
        StringBuilder message = new StringBuilder();
        try {
            if (firstNum != secondNum) {
                message.append(String.format("%d != %d\n", firstNum, secondNum));
            }
            if (firstNum > secondNum ) {
                message.append(String.format("%d > %d\n", firstNum, secondNum));
            }
            if (firstNum < secondNum ) {
                message.append(String.format("%d < %d\n", firstNum, secondNum));
            }
            if(firstNum == secondNum){
                message.append(String.format("%d = %d\n", firstNum, secondNum));
            }
            if (message.length() > 0) {
                throw new Exception(message.toString());
            }
        }catch (Exception e){
            System.out.printf("%s", e.getMessage());
        }

    }

    static void isNegative(double number) throws Exception {

        if(number < 0){
            throw new Exception("number is negative");
        }

    }

    static void secondsToHours(){

        double userSeconds = inputNumberDouble("enter the seconds to turn into hours");

        try {
            isZero(userSeconds);
            isNegative(userSeconds);
            int hours =0;
            int minutes =0;
            int seconds =0;
            if(userSeconds >0){
                hours = (int) (userSeconds / 3600); // total seconds in an hour
                minutes = (int) (userSeconds % 3600) / 60;
                seconds = (int) (userSeconds % 3600) % 60;
            }
            System.out.printf("%02d:%02d:%02d",hours,minutes,seconds);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.printf("%02d:%02d:%02d",0,0,0);
        }


    }

    static void checkEqual(){
        int firstNum = inputNumbers("Input first number");
        int secondNum = inputNumbers("Input second number");
        int thirdNum = inputNumbers("Input third number");
        int fourthNum = inputNumbers("Input fourth number");;

        if(firstNum == secondNum && firstNum == thirdNum &&firstNum == fourthNum){
            System.out.println("\nNumbers are equal");
        }else {
            System.out.println("\nNumbers are not equal!");
        }

        try {
            if(firstNum != secondNum || firstNum != thirdNum || firstNum != fourthNum){
                throw new Exception("Numbers are not equal!");
            }
            System.out.println("\nNumbers are equal");
        }catch (Exception e){
            System.out.printf("%d, %d, %d, %d, %s",
                    firstNum,secondNum,thirdNum,fourthNum,e.getMessage());
        }
    }

    static void checkPosNeg(){
        int firstNum = inputNumbers("Input a number to check positive or negative");
        try {
            isNegative(firstNum);
            isZero(firstNum);
            System.out.println("number is positive");
        }catch (Exception e){
            System.out.printf("%d, %s",
                    firstNum,e.getMessage());
        }
    }

    static void revereInt(){
        int firstNum = inputNumbers("enter a number to reverse");

        String numToWord = String.valueOf(firstNum);
        StringBuilder builder = new StringBuilder(numToWord);

        String reversedWord = builder.reverse().toString();

        System.out.printf("Reverse word: %s\n", reversedWord);
    }

    static void posNegZeroCounter(){
        int positiveCounter = 0;
        int zeroCounter =0;
        int negativeCounter =0;
        int firstNum;
        while(true){
            firstNum = inputNumbers("enter the number");
            if(firstNum ==-1){//loop exit condtion
                break;
            }
            try {
                isNegative(firstNum);
                try {
                    isZero(firstNum);
                    positiveCounter++;
                }catch (Exception e){
                    zeroCounter++;
                }
            }catch (Exception e){
                negativeCounter++;
                System.out.println("neg");
            }

        }
        System.out.printf("%d positives\n%d zero\n%d negatives\n\n", positiveCounter, zeroCounter,negativeCounter);
    }

    static void biggestNumber(){
        int userChoice = 0;
        boolean loopFlag = true;
        int firstNum = inputNumbers("enter a number");// the only real use for try catch
        int biggestNum = firstNum;
        int smallestNum = firstNum;
        while(loopFlag){
            System.out.println("1-enter a new number\n2-exit");
            userChoice = inputNumbers("enter a number");
            switch (userChoice){ // could replace the switch but this is forced and unneeded
                case 1:
                    firstNum = inputNumbers("enter a number");
                    if(firstNum > biggestNum){
                        biggestNum = firstNum;
                    } else if (firstNum < smallestNum) {
                        smallestNum = firstNum;
                    }
                    break;
                case 2:
                    loopFlag =false;
                    break;
                default:
                    System.out.println("please pick from the list");
                    break;
            }
        }
        System.out.printf("the large number : %d\n" +
                "the small number : %d\n\n", biggestNum, smallestNum);
    }

    static void numberOfA(){
        String userWord = inputString("string to find all a\'s in it");
        int aCounter = 0;
        for (int i = 0; i < userWord.length() ; i++) {
            if(userWord.toLowerCase().charAt(i) == 'a'){
                aCounter +=1;
            }
        }

        System.out.printf("Number of a\'s: %d", aCounter);
    }






    static void main() {

        applyOpsNumber(); // first task
        multiplicationTable(); // second task
        findCircleArea(); // third task
        findSumThree(); // fourth task
        avgSum(); // fifth task
        reverseWord(); //sixth task
        evenOdd(); // seventh task
        TempCenToFah(); // eighth task
        charAtIndex(); // ninth task
        rectangleArea(); // tenth task
        compareNumber();
        secondsToHours();
        checkEqual();
        checkPosNeg();
        revereInt();
        posNegZeroCounter();
        biggestNumber();
        numberOfA();

    }
}
