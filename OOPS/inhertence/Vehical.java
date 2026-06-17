package OOPS.inhertence;

public class Vehical {
    public String name;
    public String model;
    public int nooftyres;

    Vehical(){
        this.name="";
        this.model="";
        this.nooftyres=-1;
    }

    Vehical(String name,String model,int nooftyres){
        this.name=name;
        this.model=model;
        this.nooftyres=nooftyres;
    }

   public void startengine(){
        System.out.printf("enine is starting for %s : %s",name,model);
    }

  public  void stopengine(){
        System.out.printf("enine is stoping for %s : %s",name,model);
    }
}
