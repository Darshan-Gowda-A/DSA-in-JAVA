import java.util.Scanner;

public class upperorlower2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if (s==s.toUpperCase()) {
            System.out.println("upper case");
        }
        else if (s==s.toLowerCase()) {
            System.out.println("lower  case");
            
        }else
        {
            System.out.println("mix  case");
            
        }
    }
}
