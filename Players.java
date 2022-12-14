//Write a program in Java to create a Player class. Inherit the classes Cricket _Player, Football_Player and Hockey_ Player from Player class
class Player {
    String name;
    String sport;
    Player(String name,String sport){
        this.name=name;
        this.sport=sport;
    }
    void display() {
        System.out.println("Player Name:" + this.name);
        System.out.println("Sport Name:" + this.sport+"\n");
    }
}
class Cricket_Player extends Player{

    Cricket_Player(String name, String sport) {
        super(name, sport);    }
}
class Football_Player extends Player{
    Football_Player(String name, String sport) {
        super(name, sport);
    }
}
class Hockey_Player extends Player{
    Hockey_Player(String name, String sport) {
        super(name, sport);
    }
}
class Program{
    public static void main(String[] args) {
        Cricket_Player ob1=new Cricket_Player("MSD","Cricket");
        Football_Player ob2=new Football_Player("CR7","Football");
        Hockey_Player ob3=new Hockey_Player("XYZ","Hockey");
        ob1.display();
        ob2.display();
        ob3.display();
    }
}