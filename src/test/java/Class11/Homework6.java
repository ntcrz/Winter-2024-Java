package Class11;

import java.util.Arrays;

public class Homework6 {


    public static void main(String[] args) {

        String sentence = "Have a great day";
        String reverseSentence = returnReverseOrder(sentence);
        System.out.println("\nPrint the following string in reverse order: " + sentence);
        System.out.println(reverseSentence);

        int[] numbers = {1, 2, 3, 4, 5};
        int resultSum = arraySum(numbers);
        System.out.println("\nGiven array -> " + Arrays.toString(numbers));
        System.out.println("Total -> " + resultSum);

        String[] sentence2 = "Live A Life".split("[\\W]");
        String abbrString = returnAbbr(sentence2);
        System.out.println("\nAbbreviation is " + abbrString);
    }

    /**
     * Q1: Create a method return string in reverse order
     * "have a GreAT day" -> "day GreAT a have"
     * "Good Morning" -> "Morning Good"
     * "Joy" -> "Joy"
     */
    public static String returnReverseOrder(String userInput) {
        String resultString = ""; // to store the result
        String givenStringArray[] = userInput.split(" ");
        for (int i = givenStringArray.length - 1; i >= 0; i--) {
            resultString = resultString + givenStringArray[i] + " ";
        }
        return (resultString);
    }

    /**
     * Q2: Create a method to find the total of given int-array
     * int[] numbers = {1,2,3,4,5}      ->  15
     * int[] numbers = {1,2,3,1,5,6,8}  ->  26
     * int[] numbers = {1, 2, -1, -3}   ->  -1
     */
    public static int arraySum(int[] userInput2) {
        int sum = 0;
        for (int x = 0; x < userInput2.length; x++) {
            sum = sum + userInput2[x];
        }
        return (sum);
    }

    /**
     * Q3: Create a method to make abbreviation of given String
     * live A life                 ->      LAL
     * Make AmErica great Again    ->      MAGA
     * gOOd Morning                ->      GM
     */



 public static String returnAbbr(String[] userInput3) {
        String abbrString = "";
        for(String s:userInput3){
            abbrString += s.charAt(0);
        }
        return(abbrString);
    }



}