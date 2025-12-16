package ARRAY;

public class duplicateidentify {
    public static boolean duplicate(int a[]) {
        int n = a[0];
        for (int i = 1; i < a.length; i++) {
            n = Math.max(a[i], n);
        }
      
        int b[] = new int[n+1];
        for (int i = 0; i <a.length; i++) {
            b[a[i]]++;
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] > 1) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int a[] = { 1, 1,1,2,2,3,4,3,3,4};
        boolean result = duplicate(a);
        System.out.println(result);
    }
}
