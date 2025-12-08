import java.util.*;
// import java.util.Scanner;

public class exception {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    try {
     int[] a={2,3,4,5,3};
     System.out.println(a[0]/0);                        
     System.out.println(a[6]);;
    
    
    }
catch (ArithmeticException c) {
        System.out.println("invalid  -->"+c);
   }
catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("invalid  -->"+e);
   }

   finally{
   System.out.println("end of code");
   } 
   sc.close();
   } 
}
