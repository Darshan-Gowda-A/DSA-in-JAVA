package Array2D;

public class searchinsorted {

public static int[] ladersearch(int a[][],int target){
        int row = 0;
        int col=a[0].length-1;
        System.out.println(a[0].length-1);
        while (row < a.length && col>=0) {
            if (target==a[row][col]) {
                return new int[]{row,col};
            }
            else if (target>a[row][col]) {
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1,-1};
}
//     public static int[] searchusingbianry(int a[][],int target){
//        
//         System.out.println(a[0].length);
// for (int i = 0; i < a.length; i++) {
//     int start= 0;
//     int end =a[i].length-1;
//     while (start <= end) {
//         int mid=(start+end)/2;
//         if (a[i][mid]==target) {
//             return new int[]{i,mid};
//         }
//         else if (a[i][mid]<target) {
//             start=mid+1;
//         }else{
//             end=mid-1;
//         }
//     }
//     }
//     return new int[]{-1,-1};
// }

public static void main(String[] args) {
    int a[][]={{1,2},{3,4},{5,6},{7,8}};
//    int [] result=searchusingbianry(a, 3);
   int [] result=ladersearch(a, 8);
   for (int i = 0; i < result.length; i++) {
    System.out.print(result[i]+",");
   }
}
}

