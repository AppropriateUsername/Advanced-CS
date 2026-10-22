// Savannah Steele
// Period 3
// Java Week 3 HW

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class FileInteraction {
    public static void CreateFile(String[] args) {
        try{
            File myfile = new File("FileTest.txt");
            if (myfile.createNewFile()) {
                System.out.println("File created: " + myfile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void WriteFile(String[] args) {
        try (FileWriter myWriter = new FileWriter("FileTest.txt")) {
            myWriter.write("Testing Testing.");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void ReadFile(String[] args) {
        File myFile = new File("FileTest.txt");
        try (Scanner myReader = new Scanner(myFile)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

