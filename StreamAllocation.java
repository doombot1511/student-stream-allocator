import java.util.Scanner;

/**
 * Program to allocate academic streams to students based on their marks.
 * Designed for Class 9 ICSE / Java Beginners Project.
 */
public class StreamAllocation {
    public static void main(String[] args) {
        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in); 
        
        // Input student's details
        System.out.print("Enter student's name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        
        System.out.println("\n--- Result for " + name + " ---");
        
        // Decision-making logic using if-else-if ladder
        if (marks >= 300) {
            System.out.println("Stream Allocated: Science Stream + Computer");
        } 
        else if (marks >= 200 && marks < 300) {
            System.out.println("Stream Allocated: Commerce Stream + Computer");
        } 
        else if (marks >= 75 && marks < 200) {
            System.out.println("Stream Allocated: Arts");
        } 
        else {
            System.out.println("Result: Try again (Marks too low for allocation)");
        }
        
        // Close the scanner to prevent memory leaks
        sc.close();
    }
}
