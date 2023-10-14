abstract class shapes
{
    abstract int numberofsides();
}
class rectangle extends shapes
{
    private static int sides=4;
    int numberofsides()
    {
        return sides;
    }
    void display()
    {
        System.out.println("Rectangle:"+sides);
    }
}
class triangle extends shapes
{
    private static int sides=3;
    int numberofsides()
    {
        return sides;
    }
    void display()
    {
        System.out.println("Triangle:"+sides);
    }
}
class hexagon extends shapes
{
    private static int sides=6;
    int numberofsides()
    {
        return sides;
    }
    void display()
    {
        System.out.println("Hexagon:"+sides);
    }
}
 public class shape
{
    public static void main(String args[])
    {
        rectangle rect=new rectangle();
        triangle tri=new triangle();
        hexagon hex=new hexagon();
        
        rect.display();
        tri.display();
        hex.display();
    }
}
