class Ifelse
{
public static void main( String args [] )
{
int n=22;
if(n%2==0)
  {
   System.out.println("number is even");
        if(n>=2&&n<=5)
              {
                  System.out.println("Not Weird");
              }
         if(n>=6&&n<=20)
              {
                  System.out.println("Weird");
              }    
         if(n>20)
              {
                  System.out.println("Not Weird");
              }    
    }
else
   {
     System.out.println("Weird");
    }

}
}

// if n=1 output:- Weird 
// if n=4 output:- number is even
               // Not Werid 
// if n=8 output:- number is even
             //  Wierd
// if n>20 output:- nnumber is even
            // Not Weird