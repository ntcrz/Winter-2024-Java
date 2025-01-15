package Misc;

import java.util.Arrays;

public class tempHomework5 {
    public static void main(String[] args) {
        /**
         * Q1: Print values present at even index-numbers from given array in below format
         * Example:
         *      array1 = {"jOy", "earn", "lEarn", "smIle", "GiVE", "BeautifUl", "KIM"};
         *
         *      Value present at index-0 is Joy
         *      Value present at index-2 is Learn
         *      Value present at index-4 is Give
         *      ...
         *      ...
         *
         */

        String[] array1 = {"jOy", "earn", "lEarn", "smIle", "GiVE", "BeautifUl", "KIM"};
        System.out.println("\nPrint values present at even index-numbers");
    for (int i=0; i < array1.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Value present at index-"+i+" "+array1[i]);
            }
        }



        /**
         * Q2: Print the given string in reverse order
         * "have a GreAT day" -> "day GreAT a have"
         * "Good Morning" -> "Morning Good"
         * "Joy" -> "Joy"
         *
         */

        // code
        // there should NOT be any sout-statement in the for-loop

    string givenString = "Good Morning";
    string resultString = "";

        System.out.println("Given -> " + givenString);
        System.out.println("Result -> " + resultString);

        /**
         * Q3: Find the total of given int-array
         * int[] numbers = {1,2,3,4,5}      ->  15
         * int[] numbers = {1,2,3,1,5,6,8}  ->  26
         * int[] numbers = {1, 2, -1, -3}   ->  -1
         */
        int[] numbers = {1, 2, 3, 1, 5, 6, 8};
        int total = 0;
        // code
        // there should NOT be any sout-statement in the for-loop
        for(int x =0; x < numbers.length; x++) {
            total+=numbers[x];
        }
        System.out.println("\nGiven array -> " + Arrays.toString(numbers));
        System.out.println("Total -> " + total);
    }
}
