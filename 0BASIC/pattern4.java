import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int m=0;
        System.out.println("enter a number");
        int n = a.nextInt();
        for (int j = 0; j < n; j++) {
           for (int i = 0; i < n; i++) {
            if (j==0 ||i==0 ||j==n-1 || i==n-1) {
                System.out.print("* ");
            }
            else{
                m=m+1;
                System.out.print(m+" ");
            }
            
           }
           
            System.out.println();
        

            
        }
    }
}


