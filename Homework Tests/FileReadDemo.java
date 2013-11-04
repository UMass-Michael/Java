import java.util.Scanner; // Needed for the Scanner
import java.io.*;         // Needed for the File and IOException

/**
 *  This program reads data from a file.
 */

public class FileReadDemo
{
   public static void main(String[] args) throws IOException
   {
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the filename.
      System.out.print("Enter the filename: ");
      String filename = keyboard.nextLine();

      // Open the file.
      File file = new File(filename);
      Scanner inFile = new Scanner(file);

      // Read lines from the file until no more are left.
      while (inFile.hasNext())
      {
         // Read the next name.
         String friendName = inFile.nextLine();

         // Display the last name read.
         System.out.println(friendName);
      }

      // Close the file.
      inFile.close();
   }
}