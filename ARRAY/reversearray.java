package ARRAY;
public class reversearray {
    public static void main(String[] args) {
         int[] arr = { 1, 3, 5, 3, 2, 6 };
         int i=0;
         int j=arr.length-1;
         while (i<+j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

         }
           for ( i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\n");
        }
    }
}
