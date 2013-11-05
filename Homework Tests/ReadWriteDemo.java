import java.util.Scanner;
import java.io.*;

public class ReadWriteDemo
{
   public static void main(String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      int testnum = 1;
      String filename;
   
      System.out.println("How many tests do you have?");  // Prompts the user for the number of tests
      int testmax = keyboard.nextInt();
      keyboard.nextLine();
      System.out.println("What would you like the file to be named? (Do not includ extension)");  // Asks the user for a filename
      filename = keyboard.nextLine() + ".txt";
      
      // ===== Writing the file =====
      PrintWriter testFile = new PrintWriter(filename);
      System.out.println("What test score #" + testnum + "?");
      testFile.println(keyboard.nextDouble());
      for (int x = 1; x < testmax; x++) {
        testnum = testnum + 1;
        System.out.println("What test score #" + testnum + "?");
        testFile.println(keyboard.nextDouble());
      }
      testFile.close();
      System.out.println("Finished writing data to the file. \n\n");
      
      // ===== Appending the file =====
     System.out.println("How many tests would you like to add to the list?");
     testmax = keyboard.nextInt();
      
      FileWriter openFile = new FileWriter(filename, true);
      PrintWriter testFile2 = new PrintWriter(openFile);
      for (int x = 1; x <= testmax; x++) {
        testnum = testnum + 1;
        System.out.println("What test score #" + testnum + "?");
        testFile2.println(keyboard.nextDouble());
      }
      testFile2.close(); 
      
      // ===== Reading the file =====
      File testRead = new File(filename);
      Scanner readFile = new Scanner(testRead);
      while (readFile.hasNext() == true){
        System.out.println("Score: " + readFile.nextDouble());
      }
   }
}