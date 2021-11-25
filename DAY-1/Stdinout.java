import java.util.Scanner;
class Stdinout
{
public static void main(String args[] )
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter an Integer");
int i=sc.nextInt();
System.out.println("Enter a Double");
double d=sc.nextDouble();
System.out.println("Enter a String");
sc.nextLine();
String s=sc.nextLine();
System.out.println("Integer : " +i);
System.out.println("Double : " +d);
System.out.println("String : " +s);
}
}									
            	//Output :- Enter an Integer
               //10
               //Enter a Double
              //10.9999999991
              //Enter a String
             //WE ARE ONE!!!!
             //Integer : 10
            //Double : 10.9999999991
            //String : WE ARE ONE!!!!																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											