import java.util.*;
import java.io.*;
public class Anagrams
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 String s1=sc.nextLine();
 String s2=sc.nextLine();
  if(s1.length() == s2.length())
  {
       char[] charArray1 = s1.toCharArray();
       char[] charArray2 = s2.toCharArray();
       Arrays.sort(charArray1);
       Arrays.sort(charArray2);
       boolean result = Arrays.equals(charArray1, charArray2);
        if (result) {
            System.out.println("Anagrams");
            
        } else {
            System.out.println("Not Anagrams");
            
        }
  }
  else
 {
  System.out.println("not anagrams");
 }
 }
}
