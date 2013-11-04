import java.io.*;
import java.util.Scanner;
public class WriteFile
{
  public static void main(String args[]) throws IOException
  {
    PrintWriter numberList = new PrintWriter("numberList.txt");
    for (int num=1; num<=100; num++)
    {
      numberList.println(num);
    }
    numberList.close();
    
    File numList = new File("numberList.txt");
    Scanner readFile = new Scanner(numList);
    int numb = 0;
    int total = 0;
    do {
      total = total + numb;
      numb = readFile.nextInt();
    } while (numb < 100);
    System.out.println(total);
  }
}