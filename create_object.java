class box
{
    double length;
    double breadth;
    double height;
}
class demobox
{
    public static void main(String args[])
    {
        box mybox=new box();
        double vol1;
        mybox.length=10;
        mybox.breadth=20;
        mybox.height=30;
        box mybox1=new box();
        double vol2;
        mybox1.length=15;
        mybox1.breadth=25;
        mybox1.height=35;
        
        vol1=mybox.length*mybox.breadth*mybox.height;
        vol2=mybox1.length*mybox1.breadth*mybox1.height;
        
        System.out.println("The first volume is " + vol1);
        System.out.println("The second volume is" + vol2);
        
    }
}
