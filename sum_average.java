import java.util.Scanner;
public class sumaverage
{
    public static void main(String args[])
    {
        int num1,num2;
        float sum,average;
        Scanner myscanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        num1=myscanner.nextInt();
        System.out.println("Enter the second number");
        num2=myscanner.nextInt();
        myscanner.close();
        sum=num1+num2;
        average=(num1+num2)/2;
        System.out.println("The sum of the numbers is:"+ sum);
        System.out.println("The average of the two numbers is:"+ average);
    }
}
