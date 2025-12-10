import java.util.Scanner;

public class maxcpubt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 9,count=1,maxcount=0;
        int[] a = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            if (a[i]+1==a[i+1]) {
                count+=1;
                }
            else if (count>maxcount) {
                maxcount=count;
                count=1;
            }}
            if (maxcount<count) {
                maxcount=count;
            
            
        }
        System.out.println(maxcount);
}}
