final class Bike1
{
final int speed=400;
final void run()
{
 //speed=900;
 System.out.println(speed);
}
}

class Honda extends Bike1
{
 void runni()
{
 
 System.out.println("Honda Running");
}

public static void main(String args[])
{
Honda b=new Honda();
b.run();
}
}