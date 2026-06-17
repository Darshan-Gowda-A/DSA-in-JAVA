package OOPS.Abstract;

abstract class bird {
    abstract void fly();

    abstract void eat();
}

class spraow extends bird {
    @Override
    void fly() {
        System.out.println("sparrow is flying");
    }

    @Override
    void eat() {
        System.out.println("sparrow is eating");
    }
}

public class Main {


    public static void display(bird b){
        b.fly();
        b.eat();
    }

    public static void main(String[] args) {
        bird s = new spraow();
        display(s);
    }
}