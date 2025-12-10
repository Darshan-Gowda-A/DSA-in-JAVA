public class recursion1 {

    static int fun(int x) {
        if (x==6) {
            return 0;
        } 
            System.out.println("hare krishna" + x);
    
            fun(x + 1);
            
        System.out.println(x);
         return 0;
    }
     
    // static void fun1(){
    // System.out.println("hare rama");
    // fun();

    // }
    public static void main(String[] args) {
        fun(1);
        System.out.println("hey");
    }
}
