import java.util.*;


public class Main {
    static Scanner infoTaker = new Scanner(System.in);

    static ArrayList<String> findLongestWords(String[] words){
        ArrayList<String> wordsLongest = new ArrayList<>();

        int wordLength = words[0].length();

        for (String s : words) {

            if (s.length() > wordLength) { // find the longest word length
                wordLength = s.length();
            }
        }
        for(String word: words){
            if(word.length() == wordLength){ // look for all word that match that length
                wordsLongest.add(word);
            }
        }
        return wordsLongest;
    }

    static void occurrenceRate(int[] numbers){
        // tried so hard to go for less then O(n^2) can we discuss this tomorrow ?
        int count = 0; // counter for each element
        int current = numbers[0];  // last checked element
        for (int i = 0; i < numbers.length; i++) {
            if(current == numbers[i] && i !=0){ // if last element checked = current element skip
                continue;
            }
            for(int j = i; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    count++;
                    current = numbers[i];
                }
            }
            System.out.printf("%d occurs %d times\n", numbers[i], count);
            count = 0;
        }

        //
    }

    static int[] biggestK(ArrayList<Integer> numbers, int k){
        int[] biggestNumbers;
        if(k > numbers.size()){ // check if k is bigger then the actual array if yes give the max possible size
            biggestNumbers = new int[numbers.size()];
        }else { // if not the size is k
            biggestNumbers = new int[k];
        }
        biggestNumbers[0] = numbers.getFirst();
        int index = 0;
        for(int i = 0; i < biggestNumbers.length; i++) {
            for(int j = 0; j < numbers.size(); j++){
                if(numbers.get(j) > biggestNumbers[i]){ // find the largest number in the remaining arraylist
                    biggestNumbers[i] = numbers.get(j);
                    index = j;
                }
            }
            numbers.remove(index); // removes the current biggest element
        }


        return biggestNumbers;
    }

    static void reverseArray(int[] numbers){
        int elementHolder;
        int endPointer = numbers.length -1;
        int startPointer = 0;
        while(startPointer < endPointer){

            elementHolder = numbers[startPointer];
            numbers[startPointer] = numbers[endPointer];
            numbers[endPointer] = elementHolder;

            startPointer++;
            endPointer--;
        }


    }
    static int addElements(String word){
        System.out.print(word);
        return infoTaker.nextInt();
    }

    static int[] createArray(){
        int size = addElements("input the size:");
        int[] userArray = new int[size];
        for (int i = 0; i < size; i++) {
            userArray[i] = addElements("input a number:");
        }
        return userArray;
    }

    static int search(int[] numbers){
        int elementIndex = 0;
        int element = addElements("enter the number to search for:");
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == element){
                elementIndex = i;
            }
        }
        return elementIndex;
    }

    static int pivoter(int[] numbers, int start, int end){
        int pivotElement = numbers[end];
        int firstIndex = start - 1;
        int elementHolder;

        for(int i = start; i < end; i++){
            if (numbers[i] < pivotElement){
                firstIndex++;
                elementHolder = numbers[firstIndex];
                numbers[firstIndex] = numbers[i];
                numbers[i] = elementHolder;
            }
        }

        elementHolder = numbers[firstIndex + 1];
        numbers[firstIndex + 1] =  numbers[end];
        numbers[end] = elementHolder;
        return firstIndex+1;
    }
    static void quickSort(int [] numbers, int start, int end){
        if (start < end){
            int pivotIndex = pivoter(numbers, start, end); // split point to split into two parts
            quickSort(numbers, start, pivotIndex - 1); // sort left part
            quickSort(numbers, pivotIndex + 1, end); // sort right part
        }
    }

    static void menu(){
        int userChoiceMenu = 0;
        boolean loopFlag = true;
        int[] userList = new int[0];

        while(loopFlag){
            System.out.println("\nplease Pick one\n1-Accept elements of an array \n2-Display elements of an array " +
                    "\n3-Search the element within array\n4-Sort the array \n5-exit\n");
            userChoiceMenu = addElements("input:");
            infoTaker.nextLine(); //buffer clear
            switch (userChoiceMenu) {
                case 1 -> userList = createArray();
                case 2 -> System.out.println(Arrays.toString(userList));
                case 3 -> System.out.printf("element found at index %d\n", search(userList));
                case 4 -> quickSort(userList, 0, userList.length - 1);
                case 5 -> loopFlag = false;
                default -> System.out.println("pick one from the list please");

            }
    }}
    static void randomRange(){
        int start = addElements("\nfind random numbers in range \ninput start:");
        int end = addElements("input end:");

        int size = addElements("input the number of random number to generate:");
        Random random = new Random();

        if(start > end){
            int holder = end;
            end = start;
            start = holder;
        }
        for (int i = 0; i < size ; i++) {
            System.out.printf("%d ", random.nextInt(start, end+1));
        }


    }

    static int checkLength(String password){
        if(password.length() >=8){
            return 3;
        }else if (password.length() >=6 && password.length() <=7){
            return  2;
        }

        return 0;
    }

    static int checkUpperCaseLowerCase(String password){
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        for (int i = 0; i<password.length(); i++){
            if(Character.isUpperCase(password.charAt(i))){
                hasUpperCase = true;
            }else if (Character.isLowerCase(password.charAt(i))){
                hasLowerCase = true;
            }
        }
        if(hasLowerCase & hasUpperCase){
            return 3;
        }else if(hasLowerCase || hasUpperCase){
            return 2;
        }
        return 0;
    }

    static int checkSpecialCharacters(String password){
        String special = "!@#$%^&*()_+-=[]{}|;:'\",.<>?/~`";
        boolean hasSpecial = false;
        for (int i = 0; i<password.length(); i++) {
            if(special.contains(password.charAt(i)+"")){
                hasSpecial = true;
            }
        }
        if(hasSpecial){
            return 2;
        }else return 0;
    }

    static void passwordChecker(){
        int score = 0;
        infoTaker.nextLine(); // buffer clear
        System.out.print("\n\nenter your password:");
        String password = infoTaker.nextLine();
        score += checkLength(password);
        score += checkSpecialCharacters(password);
        score += checkUpperCaseLowerCase(password);

        if(score >= 8){
            System.out.println("password is strong");
        }else if (score >= 5){
            System.out.println("password is moderately strong");
        }else System.out.println("password is weak");
    }

    static void fibonacci() {
        int size = addElements("\n\nenter the fibonacci size:");
        int first = 0;
        int second = 1;

        System.out.printf("%d %d ", first, second);

        for (int i = 0; i < size - 2; i++) {
            int number = first + second;
            System.out.printf("%d ", number);
            first = second;
            second = number;
        }
    }

    static void main() {
    System.out.printf("%s\n\n",findLongestWords(new String[]{"cat","dog","red","is","am"}));
        occurrenceRate(new int[]{1,1,1,3,3,5});
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers,1000, 4, 17, 7, 25, 3, 100 );
        System.out.printf("\n\n%d biggest is : %s\n", 3, Arrays.toString(biggestK(numbers, 3)));
        int[] numbersArray = new int[]{5,4,3,2,1};
        reverseArray(numbersArray);
        System.out.printf("\n\nthe reversed array: %s\n", Arrays.toString(numbersArray));
        menu();
        randomRange();
        passwordChecker();
        fibonacci();
    }
}
