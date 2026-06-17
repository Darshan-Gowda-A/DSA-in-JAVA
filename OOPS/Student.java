package OOPS;

public class Student {
    public int id;
    public int age;
    public String name;
    public int nos;


    public Student(){
        System.out.println("consrtuctor");
        
    }

    public void study(String name){
        System.out.println(name +"studing");
    }
    public void sleep(String name){
        System.out.println(name +"sleeping");

    }
    public void eat(String name){
        System.out.println(name +"eating");

    }
    public void bunk(String name){
        System.out.println(name +"bunking");

    }
}
