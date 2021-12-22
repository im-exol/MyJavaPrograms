//Print acsii value of character
import java.util.Scanner;

public class PrintASCII
{
    public static void main(String[] args) 
    {
     Scanner scan = new Scanner(System.in);
     System.out.println("enter a character");
       char C1 = scan.next().charAt(0); // charAt(0) is a method
      int ASCIIvalue1 = C1;  // here the var C1 stores the ascii val of the given if
       System.out.println("The ASCII value of given char is : " +ASCIIvalue1); // that C1 is assigned to other int var. 
    }                                   // so that prints the value which is ascii
} // int ASCIIvalue1 = scan.next().charAt(0);
//sysout("user input is  :" + (char)ASCIIvalue1)
