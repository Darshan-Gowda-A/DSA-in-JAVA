package OOPS.Abstract;

interface bird {
    void fly();

    void eat();
}

class spraow implements bird {
    @Override
    public void fly() {
        System.out.println("sparrow is flying");
    }

    @Override
    public void eat() {
        System.out.println("sparrow is eating");
    }
}

class crow implements bird {
    @Override
    public void fly() {
        System.out.println("crow is flying");
    }

    @Override
    public void eat() {
        System.out.println("crow is eating");
    }
}

public class Interface {
    public static void display(bird b) {
        b.fly();
        b.eat();
    }

    public static void main(String[] args) {
        bird s = new spraow();
        display(s);
        bird c = new crow();
        display(c);
    }
}
