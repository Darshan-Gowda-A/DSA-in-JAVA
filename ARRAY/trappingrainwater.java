package ARRAY;

public class trappingrainwater {
    public static int trappingrainwaterp(int a[]){
        int n=a.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];

        if (n<3) {
            return 0;
        }
        leftmax[0]=a[0];
        for (int i = 1; i < n; i++) {
            leftmax[i]=Math.max(leftmax[i-1], a[i]);
        }
    

        rightmax[n-1]=a[n-1];
        for (int i = n-2; i >=0; i--) {
            rightmax[i]=Math.max(rightmax[i+1], a[i]);
        }

        int trappedwater=0;
        for (int i = 0; i < n; i++) {
            int waterlevel=Math.min(leftmax[i], rightmax[i]);

            trappedwater+=(waterlevel-a[i]);
            // System.out.println(waterlevel-a[i]);
        }
        return(trappedwater);

    }

    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        int result=trappingrainwaterp(arr);
        System.out.println(result);
    }
}
