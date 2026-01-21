package ARRAY;

public class insertionsort {
    public static void main(String[] args) {  //Time complexity=>O(n2)
        int[] arr = { 1, 3, 5, 3, 2, 6 };
        for ( int i = 1; i < arr.length; i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]<key) { //--- while (j>=0&&arr[j]>key) {(for acsending order)
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
         for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    }

