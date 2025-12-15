package ARRAY;
public class bubblesort {             //Time complexity=>O(n2)
    public static void main(String[] args) {
         int[]arr={1,3,5,3,2,6};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]<arr[j+1]) {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;                                                                                                           
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\n");
        }
    }
   


}
