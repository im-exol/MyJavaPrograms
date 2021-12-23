// patterns... 
import java.util.Scanner;

public class Pattern1Q1
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         sc.close();
         printPattern6(n); //for different patterns try different methods
        
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
                      System.out.print("  ");     //HERE WE CAN HAVE DIFFERENT PATTERNS
                    for(int j =1 ; j<=i ; j++)    // BY ARRANGING THE SPACES
                   {            
                               System.out.print(" *");
                    }
                System.out.println();    
              }
        }
        public static void printPattern6(int n)
        {
          char last = 'E' , Alphabet = 'A';
             for(int i = 1; i<= (last - 'A' + 1); ++i)
             {
                for (int j = 1; j<=i; ++j)
              {
                System.out.print(Alphabet + " ");
              }
              ++Alphabet;
              System.out.println();
             }
                
        }
}
