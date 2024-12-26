package Class6;

public class Homework2 {
    public static void main(String[] args) {

        String countryName1 = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        int result1;

        /**
         * Assign value in the result1-variable
         * if the countryName-length is greater or equals to 6
         *      assign 10 in result1
         * otherwise
         *      assign 20 in result1
         *
         * Hint: Ternary operator
         */

        int countryName1Length = countryName1.length();
        System.out.println("\nIf country name length is greater or equal to 6 result1 is 6 otherwise it's 20");
        System.out.println("Country name is: " +countryName1);
        result1 = countryName1Length >= 6 ? 6 : 20;
        System.out.println("The value of result1 is: " +result1);

        String countryName2 = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        /**
         * Ignore-cases for all below tasks
         *
         * 1. find if countryName2 contains R
         * 2. find if countryName2 starts with Ki
         * 3. find if countryName2 and countryName1 are having same value
         * 4. replace "D" in countryName2 with "SiGMa"
         */
        String countryName2LowerCase = countryName2.toLowerCase();
        System.out.println("\ncountryName2 -> " + countryName2);
        System.out.println("countryName1 -> " + countryName1);
        boolean isContains_R= countryName2LowerCase.contains("r");
        System.out.println("does countryName2 contains 'R' -> " + isContains_R);
        boolean isStartsWith_ki= countryName2LowerCase.startsWith("ki");
        System.out.println("does countryName2 starts with 'Ki' -> " + isStartsWith_ki);
        boolean isCountryName2EqualsIgnoreCase_countryName1 =  countryName2LowerCase.equalsIgnoreCase(countryName1);
        System.out.println("countryName2 and countryName1 are having same value -> " + isCountryName2EqualsIgnoreCase_countryName1);
        String replace_D_SiGMa = countryName2.replace("D", "SiGMa");
        System.out.println("countryName2 after replace 'D' with 'SigMa' -> " + replace_D_SiGMa);
    }
}
