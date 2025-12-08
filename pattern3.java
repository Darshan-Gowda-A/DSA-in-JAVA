import java.util.Scanner;

public class pattern3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < j+1; k++) {
                System.out.print("-");
            }

            for (int i = 0; i < n-j; i++) {
                System.out.print("* ");
            }
                

           
            System.out.println();
        

            
        }
    }
}
