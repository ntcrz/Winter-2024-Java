package Misc;

public class Method_Example_1 {

    public static void main(String[] args) {
        helloWorld();
        System.out.println("\nAfter helloWorld()\n");

        String result = titleCaseConverter("GoOD MoRNiNG");
        System.out.println("result -> " + result);
    }

    public static String titleCaseConverter(String userInput) {
        String sentenceResult = "";
        String[] sentenceSplit = userInput.toLowerCase().split(" ");

        for (String word : sentenceSplit) {
            String letter_0_Uppercase = word.substring(0,1).toUpperCase();
            String fromIndex1Letter_0 = word.substring(1);
            sentenceResult = sentenceResult + letter_0_Uppercase + fromIndex1Letter_0 + " ";                    // "Work " + H + ard + " " = "Work Hard "
        }
        return sentenceResult;
    }

    public static void helloWorld() {
        System.out.println("Hello World");
    }
}
