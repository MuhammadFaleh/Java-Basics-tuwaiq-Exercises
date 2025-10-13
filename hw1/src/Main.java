import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static Scanner infoTaker = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");

    public static double bmiCalculator(){
        /*
        Develop a program that takes the weight (in kilograms) and height (in meters)
        as input and calculates the BMI, then prints it.
         */
        System.out.print("input your height in meters: ");
        double height = infoTaker.nextDouble();
        System.out.print("input your weight kilograms: ");
        double weight = infoTaker.nextDouble();
        infoTaker.nextLine(); // to clear the buffer
        double bmi = weight / Math.pow(height, 2);

        return Double.valueOf(df.format(bmi)); // since you asked for two decimal places 22.86
    }

    public static String marksPercentageConvertor(){
        /*
        Write a program that takes the obtained marks and total marks as input and
        calculates the percentage, then prints it.
         */
        System.out.print("input your obtained marks: ");
        float marks = infoTaker.nextFloat();
        System.out.print("input the course total marks: ");
        float totalMarks = infoTaker.nextFloat();
        infoTaker.nextLine(); // to clear the buffer
        float percentage = (marks / totalMarks) * 100.0f;
        return percentage + "%";
    }
    public static double currencyConvertor(){

        System.out.print("input the USD amount to convert into EUR : ");
        float usd = infoTaker.nextFloat();
        infoTaker.nextLine(); // to clear the buffer
        float eur = usd * 0.85f;

        return eur;
    }

    public static void stringReverser(){
        /*
        Create a program that takes a string as input, calculates its length, and then
        reverses the string using the StringBuilder class, finally printing both the length and
        reversed string.
         */
        System.out.print("input the string you wish to reverse : ");
        String textInput = infoTaker.nextLine();
        StringBuilder strBuilder = new StringBuilder(textInput);
        System.out.printf("Length of the string: %d And Reversed string: %s\n" , textInput.length(), strBuilder.reverse());
    }

    public static String wordIndexer(){
        /*
        Develop a program that takes a sentence as input and extracts a substring from
        it, then prints the extracted substring.
         */
        System.out.print("input the string you wish to shorten : ");
        String textInput = infoTaker.nextLine();
        System.out.print("input Start Index: ");
        int start = infoTaker.nextInt();
        System.out.print("input End Index: ");
        int end = infoTaker.nextInt();
        infoTaker.nextLine(); // to clear the buffer
        return textInput.substring(start, end);
    }

    public static void wordChecker(){
        /*
        Write a program that takes a sentence and a keyword as input, then check if
        the keyword is present in the sentence and prints the result.
         */
        System.out.print("input the string you wish to check : ");
        String textInput = infoTaker.nextLine();
        System.out.print("input the keyword you wish to check for : ");
        String keyWord = infoTaker.nextLine();
        if (textInput.toLowerCase().contains(keyWord.toLowerCase())){
            System.out.printf(" Keyword \"%s\" is present in the sentence.\n", keyWord);
        }else System.out.printf(" Keyword \"%s\" is not present in the sentence.\n", keyWord);

    }

    public static String wordReplacer(){
        /*
        Develop a program that takes a sentence and a word to replace as input, then
        replace all occurrences of the word with another word and prints the modified
        sentence.
         */
        System.out.print("input the string you wish to change : ");
        String textInput = infoTaker.nextLine();
        System.out.print("input the keyword you wish to change : ");
        String keyWord = infoTaker.nextLine();
        System.out.print("input the replacement word : ");
        String replacementWord = infoTaker.nextLine();

        return textInput.toLowerCase().replaceAll(keyWord.toLowerCase(),replacementWord.toLowerCase());

    }
    public static void wordEqualityChecker(){
        /*
        Write a program that takes two strings as input and check if they are equal,
        ignoring the case, then prints whether they are equal or not.
         */
        System.out.print("input the first string : ");
        String textInput = infoTaker.nextLine();
        System.out.print("input the second string : ");
        String keyWord = infoTaker.nextLine();
        if (textInput.equalsIgnoreCase(keyWord)){
            System.out.println("Strings are equal (ignoring case)");
        }else System.out.println("Strings are not equal (ignoring case)");;

    }

    public static void main(String[] args) {

        System.out.println(marksPercentageConvertor());
        System.out.println(bmiCalculator());
        System.out.println(currencyConvertor());
        stringReverser();
        System.out.println(wordIndexer());
        wordChecker();
        System.out.println(wordReplacer());
        wordEqualityChecker();
    }
}
