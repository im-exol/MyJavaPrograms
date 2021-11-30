import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Endoffile
{
public static void main(String args[])
{
    String s= "annyeonghasaeyeo\nWE ARE ONE\nEXO-imnidha";
    Scanner sc=new Scanner(s);
    for (int i=1; sc.hasNext(); i++ )
      System.out.println(i+ "  "+sc.nextLine());
  }
}