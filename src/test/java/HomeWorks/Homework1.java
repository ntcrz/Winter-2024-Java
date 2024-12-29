package HomeWorks;
public class Homework1 {
    public static void main(String[] args) {
        /**
         * Formula sheet -> https://www.rapidtables.com/convert/temperature/fahrenheit-to-celsius.html
         *
         * F -> C
         * F -> K
         *
         * C -> F
         * C -> K
         *
         * K -> F
         * K -> C
         *
         */
        // F -> C
        double fTemp = 56;
        double fTemp_cTemp = (fTemp - 32) * 5/9;
        System.out.println(fTemp+"°F is equals to "+fTemp_cTemp+"°C");

        // F -> K
        double fTemp_kTemp = (fTemp + 459.67) * 5/9;
        System.out.println(fTemp+"°F is equals to "+fTemp_kTemp+"°K");
        
        // C -> F
        double cTemp = 13.33;
        double cTemp_fTemp = cTemp * 9/5 + 32;
        System.out.println(cTemp+"°c is equals to "+cTemp_fTemp+"°F");

        // C -> K
        double cTemp_kTemp = cTemp + 273.15;
        System.out.println(cTemp+"°c is equals to "+cTemp_kTemp+"°K");

        // K -> F =
        double kTemp = 286.48;
        double kTemp_fTemp = kTemp * 9/5 - 459.67;
        System.out.println(kTemp+"°k is equals to "+kTemp_fTemp+"°F");


        // K -> C
        double kTemp_cTemp = kTemp - 273.15;
        System.out.println(kTemp+"°K is equals to "+kTemp_cTemp+"°C");
    }
}
