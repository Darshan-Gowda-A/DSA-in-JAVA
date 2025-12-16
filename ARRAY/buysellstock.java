package ARRAY;

public class buysellstock {
    public static int stock(int a[]){
        int buyingprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for (int i = 0; i < a.length; i++) {
            if (buyingprice<a[i]) {
                int profit=a[i]-buyingprice;
                maxprofit=Math.max(maxprofit, profit);
            }else{
                buyingprice=a[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,41};
        int result=stock(a);
        System.out.println(result);
    }
}
