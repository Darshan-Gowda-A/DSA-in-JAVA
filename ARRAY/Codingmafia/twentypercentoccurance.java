package ARRAY.Codingmafia;

public class twentypercentoccurance {
    

    public static int value(int arr[]){
        int min=arr.length/4;
        for (int i = 0; i < arr.length-1; i++) {
            int count=1;
            while( i<arr.length-1 && arr[i]==arr[i+1] ) {
                count ++;
                i++;
            }
            if (count>min) {
                return arr[i];
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        int arr[]={1,2,2,6,6,6,6,7,10};

        System.out.println(value(arr));
    }
}
