import java.sql.Time;
import java.sql.Timestamp;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner infoTaker = new Scanner(System.in);
        int firstNum = 0; // holder for a first number entered by the user
        int secondNum = 0; // holder
        int thirdNum = 0;
        int fourthNum = 0;
        final double bi = (22.0/7.0); // approx 3.1428

        //first task

        System.out.println("this program will do: \n1-addition + \n2-multiply *" +
                    "\n3-subtract - \n4-divide /\n5-reminder mod");
        System.out.print("enter first number:");
        firstNum = infoTaker.nextInt();
        System.out.print("enter second number:");
        secondNum = infoTaker.nextInt();
        System.out.printf("%d + %d = %d\n", firstNum, secondNum, (firstNum+secondNum));
        System.out.printf("%d - %d = %d\n", firstNum, secondNum, (firstNum-secondNum));
        System.out.printf("%d x %d = %d\n", firstNum, secondNum, (firstNum*secondNum));
        System.out.printf("%d / %d = %d\n", firstNum, secondNum, (firstNum/secondNum));
        System.out.printf("%d mod %d = %d\n", firstNum, secondNum, (firstNum %secondNum));

        //

        //second task
        System.out.print("\nenter a number to find the multiplication table for:");
        int userNum = infoTaker.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d x %d = %d\n", userNum, i, (userNum*i));
        }


        //third
        /*
        * Perimeter = 2πr = 2 × 22/7 × 7 m = 44 m;
        * Area = πr^2 = 22/7 × 7^2 m2 = 154 m2.*/
        System.out.print("\nenter the radius to find area and perimeter: ");
        double radius = infoTaker.nextDouble();

        double perimeter = 2.0*(bi)*radius;
        double area = bi*(Math.pow(radius, 2));
        System.out.printf("Perimeter is = %f\nArea is =%f", perimeter, area);


        //

        //fourth task
        System.out.print("\n\nEnter the count of numbers: ");
        int countNum = infoTaker.nextInt();
        double userNumAvg = 0;
        double resultAvg = 0;
        for (int i = 0; i < countNum ; i++) {
            System.out.print("\nEnter an integer: ");
            userNumAvg =infoTaker.nextDouble();
            resultAvg +=userNumAvg;
        }
        System.out.printf("\nThe avrage is = %.1f\n", resultAvg / countNum);

        //

        //fifth task
        System.out.print("\ninput the first number: ");
        firstNum = infoTaker.nextInt();
        System.out.print("input the second number: ");
        secondNum = infoTaker.nextInt();
        System.out.print("input the third number: ");
        thirdNum = infoTaker.nextInt();
        infoTaker.nextLine(); // buffer clear
        boolean resultSum = thirdNum == (secondNum + firstNum);
        System.out.printf("the result is: %b\n", resultSum);

        //

        //sixth task
        // using String builder is better but not allowed
        System.out.print("\nInput a word: ");
        String userWord = infoTaker.nextLine();
        String reversedWord = "";
        for (int i = userWord.length() - 1; i >= 0 ; i--) {
            reversedWord += userWord.charAt(i);
        }

        System.out.printf("Reverse word: %s\n", reversedWord);
        //

        //seventh task
        System.out.print("\nEnter a number: ");
        firstNum = infoTaker.nextInt();

        if(firstNum %2 ==0){
            System.out.println("the number is even");
        }else {
            System.out.println("the number is odd");
        }
        //

        //eighth task
        System.out.print("\nEnter temperature in Centigrade: ");
        double userTempC = infoTaker.nextDouble();
        infoTaker.nextLine(); // buffer clear
        double tempF = userTempC *1.8 +32.0;

        System.out.printf("Temperature in Fahrenheit is: %.1f\n",tempF);
        //

        //ninth task
        System.out.print("\nInput a string: ");
        userWord = infoTaker.nextLine();
        System.out.print("Input an index: ");
        int userIndex = infoTaker.nextInt();

        System.out.printf("the letter for index %d is: %s\n", userIndex, userWord.charAt(userIndex));
        //

        //tenth task
        System.out.print("\nInput rectangle width: ");
        double rectangleWidth = infoTaker.nextDouble();
        System.out.print("Input rectangle height: ");
        double rectangleHeight = infoTaker.nextDouble();

        System.out.printf("Area is %.1f * %.1f = %.2f\n" +
                "Perimeter is %.1f * (%.1f + %.1f) = %.2f",rectangleWidth, rectangleHeight, rectangleHeight * rectangleWidth,2.0,rectangleWidth,rectangleHeight, 2.0*(rectangleHeight + rectangleWidth));

        //

        //eleventh task
        System.out.print("\nInput first integer:");
        firstNum = infoTaker.nextInt();
        System.out.print("Input second integer:");
        secondNum = infoTaker.nextInt();

        if (firstNum != secondNum) {
            System.out.printf("%d != %d\n", firstNum, secondNum);
        }
        if (firstNum > secondNum ) {
            System.out.printf("%d > %d\n", firstNum, secondNum);
        }
        if (firstNum < secondNum ) { // the one bellow it covers it but i guess its a typo in the pdf so here it's
            System.out.printf("%d < %d\n", firstNum, secondNum);
        }
        if(firstNum <= secondNum){
            System.out.printf("%d <= %d\n", firstNum, secondNum);
        }



        //twelve

        System.out.print("\nInput seconds:");
        int userSeconds = infoTaker.nextInt();

        // if Time is allowed
        Time time = new Time(0,0,userSeconds);
        System.out.println(time);

        //if not
        int hours =0;
        int minutes =0;
        int seconds =0;
        if(userSeconds >0){
            hours = userSeconds / 3600; // total seconds in an hour
            minutes = userSeconds % 3600 / 60;
            seconds = (userSeconds % 3600) % 60;
        }
        System.out.printf("%d:%d:%d",hours,minutes,seconds);


        //thirteen

        System.out.print("\nInput first number: ");
        firstNum = infoTaker.nextInt();
        System.out.print("Input second number: ");
        secondNum = infoTaker.nextInt();
        System.out.print("Input third number: ");
        thirdNum = infoTaker.nextInt();
        System.out.print("Input fourth number: ");
        fourthNum = infoTaker.nextInt();

        if(firstNum == secondNum && firstNum == thirdNum &&firstNum == fourthNum){
            System.out.println("\nNumbers are equal");
        }else {
            System.out.println("\nNumbers are not equal!");
        }
        //

        //fourteen
        System.out.print("enter the number:");
        firstNum = infoTaker.nextInt();
        if(firstNum < 0){
            System.out.println("number is negative");
        }else if(firstNum > 0){
            System.out.println("number is positive");
        }else{ // other case number is zero
            System.out.println("number is zero");
        }

        //
        // fifteen

        int positiveCounter = 0;
        int zeroCounter =0;
        int negativeCounter =0;
        while(true){
            System.out.print("\nenter the number:");
            firstNum = infoTaker.nextInt();
            if(firstNum ==-1){//loop exit condtion
                break;
            }
            if(firstNum < 0){
                negativeCounter +=1;
            }else if(firstNum > 0){
                positiveCounter +=1;
            }else{ // other case number is zero
                zeroCounter +=11;
            }
        }
        System.out.printf("%d positives\n%d zero\n%d negatives", positiveCounter, zeroCounter,negativeCounter);
        //

        //sixteen
        System.out.print("\nenter a number to reverse:");
        firstNum = infoTaker.nextInt();
        String numToWord = String.valueOf(firstNum);
        reversedWord = "";
        for (int i = numToWord.length() - 1; i >= 0 ; i--) {
            reversedWord += numToWord.charAt(i);
        }

        System.out.printf("Reverse word: %s\n", reversedWord);
        //

        //seventeen
        int userChoice = 0;
        boolean loopFlag = true;
        int biggestNum = 0;
        int smallestNum = 0;
        while(loopFlag){
            System.out.println("1-enter a new number\n2-exit");
            userChoice = infoTaker.nextInt();
            switch (userChoice){
                case 1:
                    System.out.print("\nenter a number:");
                    firstNum = infoTaker.nextInt();
                    if(firstNum > biggestNum){
                        biggestNum = firstNum;
                    } else if (firstNum < smallestNum) {
                        smallestNum = firstNum;
                    }
                    break;
                case 2:
                    loopFlag =false;
                    infoTaker.nextLine(); //buffer clear
                    break;
                default:
                    System.out.println("please pick from the list");
                    break;
            }
        }
        System.out.printf("the large number : %d\n" +
                "the small number : %d", biggestNum, smallestNum);
        //

        //eighteen
        System.out.print("\nenter a string: ");
        userWord = infoTaker.nextLine();
        int aCounter = 0;
        for (int i = 0; i < userWord.length() ; i++) {
            if(userWord.toLowerCase().charAt(i) == 'a'){
                aCounter +=1;
            }
        }
        System.out.printf("Number of a's: %d", aCounter);
        //
    }
        }

