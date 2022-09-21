//Write a class Worker and derive classes DailyWorker and SalariedWorker from it. 
//Every workerhas a name and a salary rate. Write method ComPay (int hours) to compute the week pay of everyworker. 
//A Daily Worker is paid on the basis of the number of days he/she works. 
//The SalariedWorker gets paid the wage for 40 hours a week no matter what the actual hours are. 
//Test thisprogram to calculate the pay of workers.
// You are expected to use the concept of polymorphism towrite this program.

public class Worker { 
     String worker_name;
    int salory_rate;

    public void Worker(String str,int sal){
       worker_name=str;
        salory_rate=sal;
     
    }
    void display()
    {
        System.out.println("name is "+worker_name);
        System.out.println("salory is "+salory_rate);

    }
}
    class DailyWorker extends Worker{
        
        
        public void DailyWorker(String name,int salory)
        {
            super(name,salory);
           

        }
        void display()
        {
            System.out.println("name is "+worker_name);
            System.out.println("salory is "+salory_rate);
    
        }
        public void ComPay(int hours)
        { display();
             int rate=salory_rate*hours;
             System.out.println("The rate/salory is; "+rate);
        }
    }
    class SalariedWorker extends Worker{
         
        public void SalariedWorker(String n,int sr)
        {
            super(n,sr);
        }
        void display()
        {
            System.out.println("name is "+worker_name);
            System.out.println("salory is "+salory_rate);
    
        }
        public void ComPay(int hours)
        { display();
             int rate=salory_rate*hours;
             System.out.println("The rate/salory is; "+rate);
        }

    }
    public class decide {

    
    public static void main(String args[])
    {
    DailyWorker ob=new DailyWorker("one",8);
    SalariedWorker obj=new SalariedWorker("two",10);

    }
    
}
