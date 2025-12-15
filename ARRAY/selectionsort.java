package ARRAY;

public class selectionsort {//Time complexity=>O(n2)
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 3, 2, 6 };

        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\n");
        }
    }

}
