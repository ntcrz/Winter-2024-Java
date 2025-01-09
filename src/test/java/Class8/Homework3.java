package Class8;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {

        /**
         * Question-1:
         * Create an empty array which can store 5-string values
         * using index-values, store 5-names in it.
         *
         * a) Print the entire array
         * b) if index-2-name has more than 5 characters, print the total number of characters present in the name
         *      otherwise, print the name in uppercase
         *
         */
     String[] petsArray = new String[5];
     petsArray[0] = "Cat";
     petsArray[1] = "Turtle";
     petsArray[2] = "Dog";
     petsArray[3] = "Hamster";
     petsArray[4] = "Parrot";
     System.out.println("\nList of common pets: "+ Arrays.toString(petsArray));
     int petsArrayLength = petsArray.length;
     System.out.println(petsArrayLength);



        /**
         * Question-2:
         * Create a String-variable and store any 4-words sentence in it
         *  4-words sentence example:
         *          Have a happy life
         *          have a great day
         *          wOrk HaRD paRTy HArdEr
         *          stay humble keep smiling
         *
         * convert the String into Titlecase (convert 1st-letter of each word into Uppercase and all other letters into lowercase)
         * wOrk HaRD paRTy HArdEr   -> Work Hard Party Harder
         * stay humble keep smiling -> Stay Humble Keep Smiling
         *
         */





    }
}
