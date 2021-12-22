// patterns... 
import java.util.Scanner;

public class Pattern1Q1
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         sc.close();
         printPattern5(n); //for different patterns try different methods
        
    }
        public static void printPattern(int n)
        {              
            for(int i =1; i<=n ; i++)            
              {
                  for(int j =1 ; j<=i ; j++)
                    {            
                        System.out.print("* ");
                    }
                System.out.println();    
              }
        }
       
        public static void printPattern2(int n)
        {
            for(int i =1; i<=n ; i++)
              {
                  for(int j =1;j<=i ; j++)
                    {
                        System.out.print(j+ " ");
                    }
                System.out.println();    
              }
        }
        public static void printPattern3(int n) 
        {
             for(int i= 1; i<=n;i++)
               {
                   for(int j=n;j>=i;j--)
                     {
                         System.out.print("* ");
                     }
                System.out.println();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
               }
        }
        public static void printPattern4(int n)
        {
            for(int i= 1; i<=n;i++)
               {
                   for(int j=n;j>=i;j--)
                     {
                         System.out.print(j+" ");
                     }
                System.out.println();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
               }
        }
        public static void printPattern5(int n) 
        {
            for(int i =1; i<=n ; i++)
              {
                  for(int k=n; k>i ; k--)
                      System.out.print("  ");
                    for(int j =1 ; j<=i ; j++)
                   {            
                               System.out.print(" *");
                    }
                System.out.println();    
              }
        }
}
