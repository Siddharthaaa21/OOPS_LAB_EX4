//Write a program in Java to create a Player class. Inherit the classes Cricket _Player, Football_Player and Hockey_ Player from Player class
public class Players 
{
   String name;
   String country;
   int overall_points; 
   Players(String n,String c,int p)
   {
    this.name=n;
this.country=c;
this.overall_points=p;
   }


    
}
public class Cricket_Player extends Players
{
    Cricket_Player()
    {
this.name=n;
this.country=c;
this.overall_points=p;
System.out.println(name+""+country+""+overall_points+"");
    }

}
 class  Hockey_Player extends Player
{String name;
    String country;
    int overall_points; 
    Hockey_Player (String n,String c,int p)
    {
super(n,c,p);
System.out.println(this.name+""+this.country+""+this.overall_points+"");
}
class main{
    public static void main(String args[])
    {
        Cricket_Player ob=new Cricket_Player();
        String n="Siddhartha";String c="Inda";int p=20;
        
     ob.Cricket_Player();
    }
}}