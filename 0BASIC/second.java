import java.util.Scanner;

public class second {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=6;
      int second=-999999;
      int big=-999999;
      int[] a=new int[n];
      System.out.println("enter the elements");
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      
      for(int i=1;i<n;i++){
       
            if (a[i]>=big)
            {
                second=big;
                big=a[i];
            }
            else if (a[i]<big&&a[i]>second)
            {
                second=a[i];
            }   
        }
        System.out.println(second);
         }
         
      }

    
      
      
     


