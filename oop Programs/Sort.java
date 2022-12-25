// Java program to demonstrate Working of
// Comparator interface

// Importing required classes
import java.util.*;

// Class 1
// A class to represent a student.
class Student {
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name, String address) {
        // This keyword refers to current object itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main()
    public String toString() {
        return this.rollno + " " + this.name + " " + this.address;
    }
}

// Class 2
// Helper class extending Comparator interface
class Sortbyroll implements Comparator<Student> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b) {
        System.out.println(a.rollno - b.rollno);
        return a.rollno - b.rollno;
    }
}

// Class 3
// Main class
class sort {

    // Main driver method
    public static void main(String[] args) {
        Student[] arr = { new Student(111, "bbbb", "london"),
                new Student(131, "aaaa", "nyc"),
                new Student(31, "ffdag", "paaap"),
                new Student(121, "cccc", "jaipur") };

        System.out.println("Unsorted");

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        // Sorting on basic as per class 1 created
        // (user-defined)
        Arrays.sort(arr, new Sortbyroll());
        System.out.println("\nSorted by rollno");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
