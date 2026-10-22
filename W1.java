// Savannah Steele
// Period 3 
// Java W1 HW
// Time Spent: 

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nameArray = new String[1];
        System.out.print("Enter your name: ");
        nameArray[0] = scanner.nextLine();
        System.out.print("The name stored in the array is: " + nameArray[0]);
        scanner.close();
        
    }
}
