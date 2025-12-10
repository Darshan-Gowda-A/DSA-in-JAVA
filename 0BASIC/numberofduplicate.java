import java.util.Scanner;

public class numberofduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[] a = new int[n];
        int[] b = new int[n];
        int[] h = new int[100];
        int k = 0,i=0;
        System.out.println("enter the elements");
        for ( i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for ( i = 0; i < n; i++) {

            if (h[a[i]] == 0) {
                b[k] = a[i];
                k++;
                h[a[i]] = 1;
            }
            else{
                h[a[i]]+=1;
            }
        }

        for ( i = 0; i < k; i++) {
            //  if (h[b[i]] != 1)---------->  IF WE WANT TO FIND ONLY THE UNIQUE WITH REPEATATION
              System.out.println(b[i] + "->" + h[b[i]]);
            }
        }
    }

