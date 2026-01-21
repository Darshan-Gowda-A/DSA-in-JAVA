package Array2D;

public class countnumber {
    public static int countnumber(int a[][],int target){
        int count=0;
          for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j]==target){
                    count++;
                }
            }
          }
          return count;
    }
   public static void main(String[] args) {
    int[][] array = { {4,7,8},{8,8,7} };
    int result=countnumber(array, 1);
    System.out.println(result);
   } 
}
