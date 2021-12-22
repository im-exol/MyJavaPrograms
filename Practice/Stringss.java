import java.util.*;
import java.util.Scanner;
public class Stringss
{
public static void main( String args[])
{
Scanner scan = new Scanner(System.in);
String Line = scan.nextLine();
System.out.println(Line);
String fu = Line.substring(0,1).toUpperCase()+ Line.substring(1); 
System.out.print(fu);
}
}