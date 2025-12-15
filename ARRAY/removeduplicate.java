package ARRAY;
import java.util.Scanner;

public class removeduplicate {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 8;
    int[] a = new int[n];
    int[] b = new int[n];
    int[] h = new int[100];
int k=0;
    System.out.println("enter the elements");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
    //     int f=0;
    //     for (int j = 0; j < k; j++) {
    //             if (a[i]==b[j]) {
    //                 f=1;
    //                 break;
    //             }
    //     }
    //     if (f==0) {
    //         b[k]=a[i];
    //         k++;

    //     }
    // }

    // other method
if (h[a[i]]==0) {
    b[k]=a[i];
        k++;
        h[a[i]]=1;
}}

    for (int i = 0; i < k; i++) {
        System.out.print(b[i]+" ");
      }
}}

