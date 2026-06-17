public class lcm {
     public static void main(String[] args) {
        int a=18;
        int b=12;
        int prod=a*b;
        int gcd;
        while (b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        gcd=a;
        int lcm =prod/gcd;
        System.out.println(lcm);
    }
}
