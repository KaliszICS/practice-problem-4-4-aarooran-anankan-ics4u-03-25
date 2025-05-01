/**
 * A utility class for converting primitive values to Strings, changes values from meters to centimeters, and removing non-letters from Strings
 * @author Aarooran Anankan
 * @version 1.0
 */
public final class CampbellClass {

    /**
     * private constructor
     */
    private CampbellClass() {
    }

    /**
     * Overloading method for converting int to String
     */
    public static String convertString(int num) {
        return "" + num;
    }

    /**
     * Overloading method for converting double to String
     */
    public static String convertString(double ber) {
        return "" + ber;
    }

    /**
     * Overloading method for converting char to String
     */
    public static String convertString(char acter) {
        return "" + acter;
    }

    /**
     * Overloading method for converting boolean to String
     */
    public static String convertString(boolean boo) {
        return "" + boo;
    }

    /**
     * Overloading methord that returns the centimeter value of the int meter parameter
     */
    public static int convertMetersToCenti(int meters) {
        int centi = meters*100;
        return centi;    
    }

    /**
     * Overloading methord that returns the centimeter value of the double meter parameter
     */
    public static double convertMetersToCenti(double meters) {
        double centi = meters*100.0;
        return centi;    
    }

    /**
     * Overloading method that returns a string once all non-letters are removed
     * @param str the string paramter
     * @return
     */
    public static String removeNonAlpha(String str) {
        str = str.replaceAll("[^a-zA-Z]", "");
        return str;
    }

    /**
     * Overloading method that returns a string once all non-letters are removed and changes it to all uppercase if the boolean is true, and lowercase is the boolean is false
     * @param str the string parameter
     * @param boo the boolean parameter, if true the string is changed to all uppercase, and it false the string is changed to all lowercase
     * @return
     */
    public static String removeNonAlpha(String str, boolean boo) {
        str = str.replaceAll("[^a-zA-Z]", "");
        if (boo) {
            return str.toUpperCase();
        }
        else {
            return str.toLowerCase();
        }
    }
}