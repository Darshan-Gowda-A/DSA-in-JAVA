package Array2D;

public class transpose {

    public static int[][] transposeofarray(int a[][]) {
        int rows = a.length;
        int cols = a[0].length;
        
    int[][] transposed = new int[cols][rows];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                
                transposed[j][i] = a[i][j];
            }
        }
        return transposed;

        

        // if n==m then

        // for (int i = 0; i < a.length; i++) {
        //     for (int j = i + 1; j < a[0].length; j++) {
        //         int temp = a[i][j];
        //         a[i][j] = a[j][i];
        //         a[j][i] = temp;
        //     }
        // }
        // return a;
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] result = transposeofarray(a);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
