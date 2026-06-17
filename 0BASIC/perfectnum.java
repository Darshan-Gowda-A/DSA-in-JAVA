public class perfectnum {
    public static void main(String[] args) {

    int n=6;
    int sum=1;
    for(int i=2; i<= Math.sqrt(n);i++){
        if (n%i==0) {
            int firstfactor=i;
            int secondfactor=n/i;
            sum=sum+firstfactor+secondfactor;
        }

    }
    System.out.println(sum);
    if (sum==n) {
           System.out.println("perfect number");
        
    }
        
    }
}
