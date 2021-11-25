import java.util.Scanner;
class Stdinout2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("==================================");
for(int i=0;i<3;i++)
{
  String s1=sc.next();
   int x=sc.nextInt();
   System.out.println("" +s1+"                         "+x+"");
}
System.out.println("==================================");
}
}					
//Output :-				
//==================================
//java 100
//java                         100
//python 70
//python                         70
//C 50
//C                         50
//==================================																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																