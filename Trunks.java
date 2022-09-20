
//Consider the trunk calls of a telephone exchange.
// A trunk call can be ordinary, urgent or lightning. 
//The charges depend on the duration and the type of the call. Write a program using the concept of polymorphism in Java to calculate the charges.
    
public class Trunks {
    String type;
    void Trunks(String type) 
    {
       
        this.type=type;
    }int Check(){
        if (type =="ordinary")
        return 10;
        else if(type=="urgent")
        return 15;
        else if (type=="lightning")
        return 20;
        else
        return 0;
    
    }
    
    

class Data extends Trunks{
    int rate=super(check());
   
   public void Calc(int charge)
{        System.out.println("rate is "+rate);
        System.out.println("charge  is "+rate*charge);

    }
   


}
class main{
   
    public static void main(String args[])
    {
        Trunks ob=new Trunks();
        ob.Trunks("ordinary");
        Data obj=new Data(500);
   
    }
}
}