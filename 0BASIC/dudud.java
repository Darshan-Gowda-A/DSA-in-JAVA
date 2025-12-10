import java.util.Scanner;

public class dudud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int[] a = new int[n];
        int[] b = new int[n];
        int k = 1,i=0,j=0;
        System.out.println("enter the elements");
        for ( i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        b[0]=a[0];
        for(i=1;i<n;i++){
            if (b[j]!=a[i]) {
                j++;
                b[j]=a[i];
            }
        }
        
        for ( i = 0; i <= j; i++) {
           System.out.print(b[i]+" ");
      
          }
}
}