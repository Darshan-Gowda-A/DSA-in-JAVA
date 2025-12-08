import java.util.Scanner;

public class sumofeven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 8;
    int sum = 0;
    int second = -999999;
    int big = -999999;
    int[] a = new int[n];
    System.out.println("enter the elements");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    // for(int i=0;i<n;i++){
    // if(i%2==0){
    // sum=sum+a[i];
    // }
    for (int i = 0; i < n; i = i + 2) {
      sum = sum + a[i];

    }
    System.out.println(sum);
  }
}
