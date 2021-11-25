import java.util.Scanner;
class Loops
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>=2&&n<=20)
{
for(int i=0;i<=10;i++)
  {
    System.out.println(n+"x"+i+"="+n*i);
  }
}
}
}


//Output :- 2
//2x0=0
//2x1=2
//2x2=4
//2x3=6
//2x4=8
//2x5=10
//2x6=12
//2x7=14
//2x8=16
//2x9=18
//2x10=20