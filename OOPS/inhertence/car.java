package OOPS.inhertence;

public class car extends Vehical {
    public int noofdoors;
    public String transmission;

    car(String name,String model,int nooftyres, int noofdoors,String transmission){
        super(name,model,nooftyres);
        this.noofdoors=noofdoors;
        this.transmission=transmission;

        
    }
    public  void atage(){
        System.out.printf("enine is at age for %s : %s",name,model);
    }
}


