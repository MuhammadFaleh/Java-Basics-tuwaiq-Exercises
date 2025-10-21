import java.util.*;
public class Main {
    static void main() {
        Scanner infoTaker = new Scanner(System.in);
        //first question
        System.out.println("first question:");
        int userNumber;
        int largestNumber = 0;
        System.out.println("you need to enter three numbers to find the biggest of them");
        for (int i =0; i<3; i++){
            System.out.print("enter the number:");
            userNumber = infoTaker.nextInt();
            infoTaker.nextLine();
            if(i == 0){
                largestNumber = userNumber;
            }
            if(largestNumber < userNumber){
                largestNumber = userNumber;
            }
        }
        System.out.printf("biggest number is: %d", largestNumber);
        //

        //second question
        System.out.println("\n\nsecond question:");
        System.out.print("enter a sentence: ");
        String userSentence = infoTaker.nextLine();

        System.out.print("enter an index (first char is 0): ");
        int userNumberIndex = infoTaker.nextInt();
        if(userNumberIndex > userSentence.length() - 1 || userNumberIndex < 0){
            System.out.printf("%d is out of bonds the max length is %d start from 0 please", userNumberIndex, userSentence.length());
        }else {System.out.printf("the character at index %d is %s",
                userNumberIndex, userSentence.charAt(userNumberIndex));}
        //

        //third question
        System.out.println("\n\nthird question:");

        ArrayList<Integer> userNumbers = new ArrayList<>();

        int userChoice = 0;
        int sumUserNumbers = 0;
        while(userChoice != 2){
            System.out.println("1-enter a number\n2-exit and show sum");
            userChoice = infoTaker.nextInt();
            switch (userChoice){
                case 1:
                    System.out.print("enter the number:");
                    userNumbers.add(infoTaker.nextInt());
                    break;
                case 2:
                    for(int number: userNumbers){
                       sumUserNumbers += number;
                    }
                    System.out.printf("the sum = %d", sumUserNumbers);
                    break;
                default:
                    System.out.println("enter a number from the list");
            }
        }
        //

        //fourth question
        System.out.println("\n\nfourth question:");
        int[] posNegArray = {10,-21,30,31,-25};
        for (int number: posNegArray){
            if(number > 0){
                System.out.printf("%d is a positive number\n",number);
            } else if (number < 0) {
                System.out.printf("%d is a negative number\n",number);
            }else System.out.printf("%d is a zero\n",number); //zeros are not a positive
        }
        //

        //fifth question
        System.out.println("\nfifth question:");
        String[] wordsArray = {"Tuwaiq", "Bootcamp" , "Student","JAVA"};
        String shortestWord = wordsArray[0];

        for(String word : wordsArray){
            if(word.length() < shortestWord.length()){
                shortestWord = word;
            }
        }

        System.out.printf("%s is the shortest word length = %d",
                shortestWord, shortestWord.length());
        //


    }
}
