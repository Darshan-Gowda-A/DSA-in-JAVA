import java.util.Scanner;

public class countprime {
  public static int isprime(int a){
    for (int i = 2; i < a/2; i++) {
       if (a%i==0){
      return 0;
    }
  }
        return 1;
      
      
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 4;

    
    int prime = 0;
    int[] a = new int[n];
    System.out.println("enter the elements");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      int m=a[i];
      if (isprime(m) == 1) {
        prime = prime + 1;
      }

    }
    System.out.println(prime);
  }
}
