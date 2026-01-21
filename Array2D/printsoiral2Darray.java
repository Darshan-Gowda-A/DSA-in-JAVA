package Array2D;

public class printsoiral2Darray {
    public static int[] spiralprint(int a[][]){
        int j=0;
        int Srow=0;
        int Scol=0;
        int Erow=a.length-1;
        int Ecol=a[0].length-1;
        int result[]=new int[a.length*a[0].length];

        while (Srow<=Erow && Scol<=Ecol) {
            
            for (int i = Scol; i <=Ecol; i++) {
                result[j]=a[Srow][i];
                j++;
            }
            for (int i = Srow+1; i <=Erow; i++) {
                result[j]=a[i][Ecol];
                j++;
            }
            for (int i = Ecol-1; i >=Scol; i--) {
                 if(Erow==Srow){
                    break;
                }
                result[j]=a[Erow][i];
                j++;
            }
              for (int i = Erow-1; i >=Srow+1; i--) {
                if(Ecol==Scol){
                    break;
                }
                result[j]=a[i][Scol];
                j++;
            }
            Srow++;
            Scol++;
            Ecol--;
            Erow--;
        }
       
        return result;
    }
    public static void main(String[] args) {
        int a[][]={{1,2},{3,4},{4,5},{7,8}};
       int[] result =spiralprint(a);
       int k = 0;
        for ( k = 0; k < result.length ; k++) {
            
            System.out.print(result[k]+" ");
        }
       
        
    
}
}
