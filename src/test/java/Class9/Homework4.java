package Class9;

public class Homework4 {
    public static void main(String[] args) {
        /**
         * Question-1:
         * create two variables, one variable stores the studentScore and another variable stores maxScore
         * calculate student percentage ; based on the student percentage, print the student-grade.
         *
         * Grade-A : 91-100%
         * Grade-B : 81-90.99%
         * Grade-C : 71-80.99%
         * Grade-D : 61-70.99%
         * Grade-E : 51-60.99%
         * Grade-F : less than 51%
         *
         * if the studentScore is invalid or greater than maxScore, print "Invalid student score entered"
         *
         *
         * double studentScore = 210
         * int maxScore = 180
         * percentage
         *
         * (studentScore/maxScore)*100
         */

        double studentScore = 95;
        int maxScore = 100;
        double percentageScore = (studentScore / maxScore) * 100;

        System.out.println("\nStudent Grade based on percentage");
        if (percentageScore >= 91 && percentageScore <= 100) {
            System.out.println("Student Percentage is: " +percentageScore + " Grade is A");
        } else if (percentageScore >= 81 && percentageScore <= 90.99) {
            System.out.println("Student Percentage is: " +percentageScore+ " Grade is B");
        } else if (percentageScore >= 71 && percentageScore <= 80.99) {
            System.out.println("Student Percentage is: " +percentageScore+ " Grade is C");
        } else if (percentageScore >= 61 && percentageScore <= 70.99) {
            System.out.println("Student Percentage is: " +percentageScore+ " Grade is D");
        } else if (percentageScore >= 51 && percentageScore <= 60.00) {
            System.out.println("Student Percentage is: " +percentageScore+ " Grade is E");
        } else if (percentageScore <= 51) {
            System.out.println("Student Percentage is: "+percentageScore+ " Grade is F");
        } else {
            System.out.println("Invalid student score entered " + studentScore);
        }


        /**
         * Question-2:
         * Create a variable (myNumber) and store any value in it.
         * if the myNumber is divisible by 5, print "divisible by 5"
         * if the myNumber is divisible by 3, print "divisible by 3"
         * if the myNumber is divisible by 5 and by 3, print "divisible by 5 and 3"
         * if the myNumber is NOT divisible by 5 and by 3, print the value in myNumber
         *
         * int myNumber = 15;
         */
        System.out.println("\nBased on value of myNumber, print a statement");
        int myNumber = 60;
        if (myNumber%3 ==0 && myNumber%5 ==0) {
            System.out.println("divisible by 5 and 3");
        } else if (myNumber%5 ==0 ) {
            System.out.println("divisible by 5");
        } else if (myNumber%3 ==0 ) {
            System.out.println("divisible by 3");
        } else {
            System.out.println("myNumber: "+myNumber+ " is not divisible by 5 or 3 " );
        }
    }
}
