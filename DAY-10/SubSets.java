import java.util.*;
import java.io.*;
public class SubSets {
    public static void main(String[] args) {
        String str = "LEE JI YOON";
        int len = str.length();
        int temp = 0;
        String arr[] = new String[len*(len+1)/2];
        for(int i=0; i<len; i++)
        {
            for(int j=i+1; j<=len; j++)
            {
                arr[temp] = str.substring(i,j);
                temp++;
            }
        }
        System.out.println("All subsets for given strings are:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+"\n");
        }
    }
    
}
