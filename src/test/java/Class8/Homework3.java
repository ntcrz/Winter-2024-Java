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

     if (petsArray[2].length() > 5) {
      System.out.println("Length of index-2 common pets -> " + petsArray[2].length());
     } else {
      System.out.println("Index-2 common pets in Uppercase -> " + petsArray[2].toUpperCase());
     }

     if (petsArray[0].length() > 5) {
      System.out.println("Length of index-0 common pets -> " + petsArray[0].length());
     } else {
      System.out.println("Index-0 common pets in Uppercase -> " + petsArray[0].toUpperCase());
     }

     if (petsArray[1].length() > 5) {
      System.out.println("Length of index-1 common pets -> " + petsArray[1].length());
     } else {
      System.out.println("Index-1 common pets in Uppercase -> " + petsArray[1].toUpperCase());
     }
     if (petsArray[3].length() > 5) {
      System.out.println("Length of index-3 common pets -> " + petsArray[3].length());
     } else {
      System.out.println("Index-3 common pets in Uppercase -> " + petsArray[3].toUpperCase());
     }
     if (petsArray[4].length() > 5) {
      System.out.println("Length of index-4 common pets -> " + petsArray[4].length());
     } else {
      System.out.println("Index-4 common pets in Uppercase -> " + petsArray[4].toUpperCase());
     }


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

     String questionTwo = "wOrk HaRD paRTy HArdEr";
     System.out.println("Question 2 string -> " + questionTwo);
     String[] splitBy_space = questionTwo.split(" ");      // ["wOrk", "HaRD", "paRTy", "HArdEr"]

     String index0Word = splitBy_space[0];   // "wOrk"
     String index0Letter_0 = index0Word.substring(0,1);
     String index0Letter_0_Uppercase = index0Letter_0.toUpperCase();
     String fromIndex1Letter_0 = index0Word.substring(1);
     String fromIndex1Letter_0_Lowercase = fromIndex1Letter_0.toLowerCase();
     splitBy_space[0] = index0Letter_0_Uppercase + fromIndex1Letter_0_Lowercase;     // ["Work", "HaRD", "paRTy", "HArdEr"]

     String index1Word = splitBy_space[1];   // "HaRD"
     String index0Letter_1 = index1Word.substring(0,1);  // "H"
     String index0Letter_1_Uppercase = index0Letter_1.toUpperCase(); // "H"
     String fromIndex1Letter_1 = index1Word.substring(1);    // "aRD"
     String fromIndex1Letter_1_Lowercase = fromIndex1Letter_1.toLowerCase(); // "ard"
     splitBy_space[1] = index0Letter_1_Uppercase + fromIndex1Letter_1_Lowercase;     // ["Work", "Hard", "paRTy", "HArdEr"]

     String index2Word = splitBy_space[2];   // "paRTy"
     String index0Letter_2 = index2Word.substring(0,1);  // "p"
     String index0Letter_2_Uppercase = index0Letter_2.toUpperCase(); // "P"
     String fromIndex1Letter_2 = index2Word.substring(1);    // "aRTy"
     String fromIndex1Letter_2_Lowercase = fromIndex1Letter_2.toLowerCase(); // "arty"
     splitBy_space[2] = index0Letter_2_Uppercase + fromIndex1Letter_2_Lowercase;     // ["Work", "Hard", "Party", "HArdEr"]

     String index3Word = splitBy_space[3];   // "HArdEr"
     String index0Letter_3 = index3Word.substring(0,1);  // "H"
     String index0Letter_3_Uppercase = index0Letter_3.toUpperCase(); // "H"
     String fromIndex1Letter_3 = index3Word.substring(1);    // "ArdEr"
     String fromIndex1Letter_3_Lowercase = fromIndex1Letter_3.toLowerCase(); // "arder"
     splitBy_space[3] = index0Letter_3_Uppercase + fromIndex1Letter_3_Lowercase;     // ["Work", "Hard", "Party", "Harder"]

     String question2Result = splitBy_space[0] + " " + splitBy_space[1] + " " + splitBy_space[2] + " " + splitBy_space[3];
     //          "Work" + " " + "Hard" + " " + "Party" + " " + "Harder"

     System.out.println("Question 2 Result -> " + question2Result);


    }
}
