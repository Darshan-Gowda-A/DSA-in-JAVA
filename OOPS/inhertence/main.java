package OOPS.inhertence;

public class main {
    public static void main(String[] args) {
        car c=new car("maruti", "shift", 4, 4, "manual");
        motorcycle m=new motorcycle("honda", "shine", 2, 60, "telescopic");

        c.startengine();
        System.out.println();
        m.startengine();
        System.out.println();

        c.atage();
        System.out.println();

        m.wheelie();
    }
}
