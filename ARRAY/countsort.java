package ARRAY;

public class countsort {
    public static void main(String[] args) {
         int[] arr = { 1, 3, 5, 3, 2, 6 };
         int max=Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
            max=Math.max(max, arr[i]);
        }
        System.out.println(max);
           int count[]=new int[max+1];
         for (int i = 0; i < arr.length; i++) {
                count[arr[i]]++;
         }
         for (int i = max; i >=0; i--) {
            for (int j = 0; j < count[i]; j++) {
                System.out.println(i);
            }
         }
    }
}
