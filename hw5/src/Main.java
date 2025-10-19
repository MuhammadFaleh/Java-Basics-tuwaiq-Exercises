import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static void main() {
        //first task
        Scanner infoTaker = new Scanner(System.in);

        int [] arrayInt = {50,-20,0,30,40,60,10};

        if(arrayInt[0] == arrayInt[arrayInt.length -1]){
            System.out.println("the first and last element are the same");
        }else System.out.println("the first and last element are not the same");
        //
        // second task

        int [] arrayAvg = {1, 4, 17, 7, 25, 3, 100};
        double result = Arrays.stream(arrayAvg).average().getAsDouble(); // if allowed
        ArrayList<Integer> greaterList = new ArrayList<>();
        for(int number : arrayAvg){
            if(number > result){
               greaterList.add(number);
            }
        }
        System.out.printf("The average of the said array is: %.2f The numbers in the said array that are \n" +
                "greater than the average are: %s\n",
                result,greaterList.toString().replace("[", "").replace("]", ""));


        // *** if not allowed to use average() look below ***
//        result = 0;
//        for(int number : arrayAvg){
//            result +=number;
//        }
//        result /= arrayAvg.length;
//        greaterList = new ArrayList<>();
//        for(int number : arrayAvg){
//            if(number > result){
//                greaterList.add(number);
//            }
//        }
//        System.out.printf("\n\nThe average of the said array is: %.2f The numbers in the said array that are \n" +
//                "greater than the average are: %s", result,greaterList.toString().replace("[", "").replace("]", ""));

        // ***                                             ***
        //
        // third task
        arrayInt = new int[]{20, 30, 40};

        if(arrayInt[0] > arrayInt[arrayInt.length -1]){
            System.out.printf("%d is bigger than %d\n", arrayInt[0], arrayInt[arrayInt.length -1]);

        }else if (arrayInt[0] < arrayInt[arrayInt.length -1]) {
            System.out.printf("%d is bigger than %d\n", arrayInt[arrayInt.length -1], arrayInt[0]);

        }else System.out.println("elements are the same");
        //
        // fourth task
        int[] firstArray = {20,30,40};
        int[] secondArray = firstArray.clone();

        int firstElementHolder = secondArray[0];
        secondArray[0] = secondArray[secondArray.length -1];
        secondArray[secondArray.length - 1] = firstElementHolder;
        System.out.printf("new array after swaping %s\n",Arrays.toString(secondArray));
        //
        // fifth task
        int [] oddEvenArray = {2,3,40,1,5,9,4,10,7};
        int elementHolder = 0;
        int endPointer = oddEvenArray.length -1;
        int startPointer =0;
        while(startPointer< endPointer){

            if(oddEvenArray[startPointer] %2==0 && oddEvenArray[endPointer] %2!=0){
                elementHolder = oddEvenArray[startPointer];
                oddEvenArray[startPointer] = oddEvenArray[endPointer];
                oddEvenArray[endPointer] = elementHolder;
                startPointer++;
                endPointer--;
            }else if(oddEvenArray[startPointer] %2!=0){
                startPointer++;
            }else
                endPointer--;
            }
        System.out.println(Arrays.toString(oddEvenArray));
        //
        // final task
        firstArray = new int[]{2,3,6,6,4};
        secondArray = new int[]{2,3,6,6,4};
        boolean isArrayEqual = false;
        if(firstArray.length != secondArray.length){ // if not same length they can't be equal
            isArrayEqual = false;
            System.out.printf("%b not the same length", isArrayEqual);
        }else{
        for (int i = 0; i < firstArray.length ; i++) {
           if(firstArray[i] != secondArray[i]){
               isArrayEqual = false;
               break;
           }else isArrayEqual = true;
        }
        if(isArrayEqual){
            System.out.printf("%b are equal", isArrayEqual);
        }else System.out.printf("%b not equal", isArrayEqual);
        }

        //


    }
}

