import java.util.*;
import java.io.*;
public class Changecase {
    public static void main(String[] args) {
        String str1 = "we are one exo";
        StringBuffer newStr = new StringBuffer(str1);
        for(int i=0; i<str1.length();i++)
        {
            if(Character.isLowerCase(str1.charAt(i)))
            {
                newStr.setCharAt(i,Character.toUpperCase(str1.charAt(i)));
            }
            else if(Character.isUpperCase(str1.charAt(i)))
            {
                newStr.setCharAt(i,Character.toLowerCase(str1.charAt(i)));
            }
        }
        System.out.println("String after case converstion:"+newStr);
    }
    
}
