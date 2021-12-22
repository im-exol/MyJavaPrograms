public class PrintPalindrome {
    public static void main(String[] args) {
        String PD = "malayalam"; 
        System.out.println("the original : " +PD);
        String reversePD = (new StringBuffer(PD)).reverse().toString();
        System.out.println("reversed String : " +reversePD);
        if (PD.equals(reversePD))
        {
           System.out.println("PALINDROME"); // stringbuffer have the method to 
        }            //reverse a string so we used and again done the type 
        else               //conversion thingy which is to.string()
        {
            System.out.println("NOT PALINDROME");
        }
    }
}
