import java.util.*;
import java.io.*;
public class CountCharacter {
    public static void main(String[] args) {
        String string = "LIGHT SABER LIFE SAVER";
        int count = 0;
        for(int i=0; i<string.length(); i++)
        {
            if(string.charAt(i)!=' ')
            count++;
        }
        System.out.println("The number of characters in a string:"+count);
    }
    
}
