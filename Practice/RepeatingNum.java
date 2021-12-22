import java.util.Scanner;

public class RepeatingNum {
    public static void main(String[] args)
    {
        String clgName = "Ashoka college of engieering"; 
        char Ch = 'e';
         int count = 0;
         for(int i=0;i<clgName.length();i++)
         {
             if(Ch==clgName.charAt(i))
             {
                 count++;
             }
            
         }
         System.out.println(count);
    }
    
    
    }
    
