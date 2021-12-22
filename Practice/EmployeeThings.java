import java.util.Scanner;

public class EmployeeThings {
    public static void main(String[] args)
 {
         String Name;
         String ID;
         String Designation;
 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Employee Arr[] = new Employee();
    
    
    for(int i=0; i<n;i++)
    {
        System.out.println("enter employee name");
        String Name = sc.nextLine();
        System.out.println("enter employee ID");
        String ID = sc.nextLine();
        System.out.println("enter employee Designation");
        String DEsignation = sc.nextLine();

    }

 }
}
