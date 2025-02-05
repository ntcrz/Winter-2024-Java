package Class15;

import java.util.ArrayList;

public class Homework7 {
    public static void main(String[] args) {
        ArrayList<String> student2027List = new ArrayList<>();      // []
        student2027List.add("John");
        student2027List.add("KenDRa");
        student2027List.add("JOHN");
        student2027List.add("JIa");
        student2027List.add("MichAEl");
        student2027List.add("LuX");
        student2027List.add("John");
        student2027List.add("Kendra");
        student2027List.add("Jia");
        student2027List.add("John");
        student2027List.add("JIa");
        student2027List.add("Jia John");
        student2027List.add("Jia Lis");
        student2027List.add("King");
        student2027List.add("QUEEN");
        student2027List.add("Dime");
        student2027List.add("KenDRa");
        student2027List.add("JOHN");
        student2027List.add("JIa");
        student2027List.add("MichAEl");
        student2027List.add("John");
        student2027List.add("Kendra");
        student2027List.add("John");
        student2027List.add("KenDRa");
        student2027List.add("JOHN");
        student2027List.add("JIa");
        student2027List.add("MichAEl");
        student2027List.add("LuX");
        student2027List.add("John");
        student2027List.add("Kendra");
        student2027List.add("Jia");
        student2027List.add("John");
        student2027List.add("Jia");
        student2027List.add("John");
        student2027List.add("JIa");
        student2027List.add("Jia John");
        student2027List.add("John");
        student2027List.add("Kendra");
        student2027List.add("Jia");
        student2027List.add("John");
        student2027List.add("JIa");
        student2027List.add("Jia John");
        student2027List.add("Jia Lis");
        student2027List.add("King");
        student2027List.add("QUEEN");
        student2027List.add("Dime");

        System.out.println("student2027ListSize -> "+ student2027List.size());      // 46
        System.out.println("student2027List -> "+ student2027List);

        /**
         * Q1: Find the index-of third occurrence of JOHN(ignoring cases) in student2027List
         *
         * if third-occurrence of JOHN (ignoring cases) is present in student2027List
         *      store the index-number in a variable, and then print it.
         * else
         *      store -1 in a variable, and then print it.
         */
        String target = "JOHN";
        int occurrence = 3;
        int index = -1;
        int c = 0;

        for (int i = 0; i < student2027List.size(); i++) {
            if (student2027List.get(i).equalsIgnoreCase(target)) {
                c++;
                if (c == occurrence) {
                    index = i;
                    break;
                }
            }
        }

        if (index != -1) {
            System.out.println("Index of the third occurrence of \"" + target + "\": " + index);
        } else {
            System.out.println("The third occurrence of \"" + target + "\" was not found. " +index);
        }

        /**
         * Q2: Find the number of students who has name starts with "g"(ignore cases) in student2027List
         */
        System.out.println("\nFind the number of students who has a name that starts with 'K' (ignore cases) in student2027List");
        int counter=0;

        for (String name : student2027List) {
            if (name.startsWith("k") || name.startsWith("K")) {
                counter++;
            }
        }

        System.out.println("Result : " + counter);

        /**
         * Q3: Find if "King" (ignore cases) is present ONLY once in student2027List
         *
         * if "King" (ignore cases) is present ONLY once in student2027List
         *      store true in variable, and then print it
         * else
         *      store false in variable, and then print it
         */
        boolean result = false;
        int count = 0;
        String firstName = "John";
        System.out.println("\nCheck if " +firstName+ " (ignore cases) is present ONLY once in student2027List");
        for (String name : student2027List) {
            if (name.equalsIgnoreCase(firstName)) {
                count++;
                if (count > 1) {
                    result = false;
                    break;
                } else {
                    result = true;
                }

            }
        }

        System.out.println("does student20027-ArrayList contain "+firstName+ " only once (ignore cases) -> " + result +count );

        /**
         * Q4: Find the total of bills-ArrayList
         */
        ArrayList<Double> bills = new ArrayList<>();
        bills.add(101.01);
        bills.add(89.76);
        bills.add(564.93);
        bills.add(98.65);
        bills.add(7.98);
        bills.add(23.17);
        bills.add(983.89);
        bills.add(64.83);
        bills.add(57.7);
        bills.add(101.01);
        bills.add(112.9);
        bills.add(2.32);
        bills.add(12.34);
        bills.add(98.45);
        bills.add(98.65);

        double billSum= 0;
        for (int i=0; i<= bills.size()-1; i++) {
            billSum += bills.get(i);
        }

        System.out.println("\nSum of bills array is: " +billSum);
























    }
}
