import java.util.*;

public class Date_Time {
    public static void main(String[] args)
    {
     String DT = "03:10:26 SUNDAY 19-12-2021";
     /* int Hr= Integer.parseInt(DT.substring(0,2));
      int Min = Integer.parseInt(DT.substring(3,5));
      int Sec = Integer.parseInt(DT.substring(6,8));
      String Day = DT.substring(10, 16);
      int Date = Integer.parseInt(DT.substring(17,19));
      int Mon = Integer.parseInt(DT.substring(20,23));
      int sec = Integer.parseInt(DT.substring(24));
        System.out.println("hour : " +Hr);
        System.out.println("Min : " +Min);
        System.out.println("seconds : " +sec);
        System.out.println("Day : " +Day);
        System.out.println("Date : " +Date);
        System.out.println("Month : " +Mon);
        System.out.println("Seconds : " +Sec);*/
        
          String part[] = DT.split(" ");
System.out.println(part[0] +  part[1] +  part[2]);
String temp =part[0];
String firstString[] = temp.split(":");
System.out.println("hr : " +firstString[0]);
System.out.println("min : " +firstString[1]);
System.out.println("sec : " +firstString[2]);
System.out.println("Day : " +part[1]);
String last = (part[2]);
String [] segment = last.split("-");
System.out.println("Date : " + segment[0]);
System.out.println("mon : " + segment[1]);
System.out.println("year : " + segment[2]);


    }
}




