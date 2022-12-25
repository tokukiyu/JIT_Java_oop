// Java program to Demonstrate asList() method
// of Arrays class for a string value

// Importing utility classes
import java.util.*;

// Main class
class App3 {
    // Main driver method
    public static void main(String[] argv) throws Exception {

        // Try block to check for exceptions
        try {

            // Creating Arrays of String type
            String a[] = new String[] { "A", "B", "C", "D" };
            System.out.println(a);
            // Getting the list view of Array
            // List<String> list = Arrays.asList(a);
            Arrays.asList(a);
            // Printing all the elements in list object
            System.out.println("The list is: " + Arrays.asList(a));
        }

        // Catch block to handle exceptions
        catch (NullPointerException e) {

            // Print statement
            System.out.println("Exception thrown : " + e);
        }
    }
}
