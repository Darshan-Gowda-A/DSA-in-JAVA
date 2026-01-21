package Array2D;

public class DiagonalSum3DArray {
    public static int DiagonalSum(int a[][]){
          int sum=0;
         int j=0;
        int Erow=a.length;
        // int Erow=a.length-1;
        // for (int i = 0; i < Erow; i++) {
        //     sum=sum+a[i][i];
        // }
        // for (int i =Erow; i >=0; i--) {
        //     if (i==j) {
        //         j++;
        //         continue;
        //     }
        //     sum=sum+a[i][j];
        //     j++;
        // }


        for (int i = 0; i < Erow; i++) {
            sum=sum+a[i][i];
            if (i!=Erow-1-i) {
                sum=sum+a[i][Erow-i-1];
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int resultsum=DiagonalSum(a);
        System.out.println(resultsum);
    }
    
}
