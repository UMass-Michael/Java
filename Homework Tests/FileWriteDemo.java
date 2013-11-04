import java.util.Scanner;   // Needed for Scanner
import java.io.*;           // Needed for File and IOException

public class FileWriteDemo
{
   public static void main(String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      int testnum = 1;

      // Writing the file
      PrintWriter testFile = new PrintWriter("myTests.txt");
      System.out.println("What test score #" + testnum + "?");
      testFile.println(keyboard.nextDouble());
      for (int x=1; x<10; x++) {
        testnum = testnum + 1;
        System.out.println("What test score #" + testnum + "?");
        testFile.println(keyboard.nextDouble());
      }
      testFile.close();
      System.out.println("Finished writing data to the file. \n\n");
      
      // Appending the file
      FileWriter openFile = new FileWriter("myTests.txt", true);
      PrintWriter testFile2 = new PrintWriter(openFile);
      for (int x=1; x<=5; x++) {
        testnum = testnum + 1;
        System.out.println("What test score #" + testnum + "?");
        testFile2.println(keyboard.nextDouble());

      }
      testFile2.close(); 
      
      // Reading the file
      File testRead = new File("myTests.txt");
      Scanner readFile = new Scanner(testRead);
      while (readFile.hasNext() == true){
        System.out.println("Score: " + readFile.nextDouble());
      }
   }
}