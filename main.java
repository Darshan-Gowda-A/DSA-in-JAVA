import java.util.Scanner;

public class main{

    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    //   int count=0;
      int n=6;
      int big=0;
      int[] a=new int[n];
      System.out.println("enter the elements");
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      int j=0;
      for(int i=1;i<n;i++){
        if (a[i]>=a[j]) {
           big=a[i];
           j++;
         }
      }

    //   for(int i=0;i<n;i++){
    //     if(a[i]%2==0){
    //         count++;
    //     }
        
      
      System.out.println(big);
    } 
}