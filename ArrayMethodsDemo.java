/**
 * A program that demonstrates various array processing methods.
 * CITATION: The logic for array processing methods was guided by 
 * the Chapter 7 video archives, recaps and Java tutorials on YouTube.
 * @author David A. Rivera Ortiz
 * @version 1.0
 * @since 2026-04-19
 */
public class ArrayMethodsDemo {
    
    public static void main(String[] args) {
        int[] numbers = { 12, 15, 23, 67, 85, 114, 256, 850 };
        
        displayArray(numbers);
        System.out.println("The total of the array is " + getTotal(numbers));
        System.out.println("The average of the array is " + getAverage(numbers));
        System.out.println("The highest value in the array is " + getHighest(numbers));
        System.out.println("The lowest value in the array is " + getLowest(numbers));
    }
    
    /**
     * Prints all the values in an integer array on a single line.
     * @param array The integer array to be displayed.
     */
    public static void displayArray(int[] array) {
        System.out.print("The values in the array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println(); 
    }
    /**
     * Calculates the total sum of all values in an integer array.
     * @param array The integer array to process.
     * @return The total sum of the array's elements.
     */
    public static int getTotal(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }
    
    
    /**
     * Calculates the average of all values in an integer array.
     * @param array The integer array to process.
     * @return The average of the array's elements as a double.
     */
    public static double getAverage(int[] array) {
        double total = getTotal(array);

        return total / array.length;
    }
    
    
    /**
     * Finds the highest value in an integer array.
     * @param array The integer array to process.
     * @return The highest value found in the array.
     */
    public static int getHighest(int[] array) {
        int highest = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > highest) {
                highest = array[i]; 
            }
        }
        return highest;
    }

    /**
     * Finds the lowest value in an integer array.
     * @param array The integer array to process.
     * @return The lowest value found in the array.
     */
    public static int getLowest(int[] array) {
     
        int lowest = array[0];
        

        for (int i = 1; i < array.length; i++) {
            if (array[i] < lowest) {
                
                lowest = array[i];
            }
        }
        
        return lowest;
    }
}