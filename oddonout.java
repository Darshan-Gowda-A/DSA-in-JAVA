import java.util.Scanner;

public class oddonout {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int[] a = new int[n];
        // int[] h = new int[100];
        int f=0;
        int i=0;
        System.out.print("enter the elements");
        for ( i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // for ( i = 0; i < n; i++) {

        //     if (h[a[i]]==0) {
        //         h[a[i]] = 1;
        //         }
        //         else{
        //             h[a[i]]+=1;

        //         }
        // }

        // for ( i = 0; i < n; i++) {
           
        //      if (h[a[i]]==1) {
        //         System.out.println(a[i]);1
                
        //      }
        //     }
        for ( i = 0; i < n-1; i=i+2) {
            //  s^=a[i];
            if (a[i]!=a[i+1]) {
                f=1;
                System.out.println(a[i]);
                break;
            }
            // else if (i==n-3) {
            
            //     System.out.println(a[i+2]);
            // }
            if (f==0) {
                System.out.println(a[n-1]);
            }
        }
        
        }
    }

