import java.util.Scanner;

/**
 * This class models a Triangle object with a name, base, and height.
 * CITATION: The logic for calculating the area, structuring the constructors, 
 * and formatting the output was guided by the Chapter 6 lecture archives 
 * and Java programming tutorials on YouTube.
 * @author David A. Rivera Ortiz
 * @version 1.0
 * @since 2026-03-18
 */
public class Triangle {
    
    // --- Instance Variables (Private for Encapsulation/Data Hiding) ---
    private String name;
    
    // Template: declarations of one type on a single line
    private double base, height; 

    /**
     * No-arg constructor that sets default values for the triangle.
     */
    public Triangle() {
        
        name = "Unknown";
        
        base = 0.0;
        
        height = 0.0;
    }

    /**
     * Parameterized constructor to set the triangle's fields upon creation.
     * @param inName The name assigned to the triangle.
     * @param inBase The base dimension of the triangle.
     * @param inHeight The height dimension of the triangle.
     */
    public Triangle(String inName, double inBase, double inHeight) {
        name = inName;
        
        base = inBase;
        height = inHeight;
        
    }

    /**
     * Sets the name of the triangle.
     * @param newName The new name for the triangle.
     */
    public void setName(String newName) {
        name = newName;
        
    }

    /**
     * Sets the base dimension of the triangle.
     * 
     * @param newBase The new base dimension.
     */
    public void setBase(double newBase) {
        
        base = newBase;
    }

    /**
     * Sets the height dimension of the triangle.
     * @param newHeight The new height dimension.
     */
    public void setHeight(double newHeight) {
        height = newHeight;
    }

    /**
     * Calculates the area of the triangle. 
     * This is a private helper method as requested in the UML.
     * @return The calculated area of the triangle.
     */
    private double getArea() {
        // Operation formatted per template rules
        
        return 0.5 * base * height; 
    }

    /**
     * Prompts the user to enter the name, base, and height of the triangle.
     */
    public void readInput() {
        // Scanner is declared locally, NOT as an instance variable, per the lecture
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is the triangle's name: ");
        name = keyboard.nextLine();
        
        System.out.print("What is the triangle's base: ");
        base = keyboard.nextDouble();
        
        System.out.print("What is the triangle's height: ");
        height = keyboard.nextDouble();
    }

    /**
     * Displays the triangle's name, base, height, and area to the console.
     */
    public void writeOutput() {
        System.out.println("Triangle name is: " + name);
        
        System.out.println("Triangle base is: " + base);
        
        System.out.println("Triangle height is: " + height);
        
        // Using printf to round to 1 decimal place and \n to advance to the next line
        System.out.printf("Triangle area is: %.1f\n", getArea());
    }
}