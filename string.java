import java.util.*;
class userinput
{
    public static void main(String args[])
    {
       
        Scanner myscanner=new Scanner(System.in);
        System.out.println("Enter the name");
        String str=myscanner.nextLine();
        int num=Integer.parseInt(str);
        System.out.println("Enter the name");
        String str1=myscanner.nextLine();
        int num2=Integer.parseInt(str1);
        int sum=num+num2;
        System.out.println("The name is:"+ sum);
      
    }
}
