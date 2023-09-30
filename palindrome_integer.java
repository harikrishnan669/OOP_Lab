import java.util.*;
class userinput
{
    public static void main(String args[])
    {
        Scanner myscanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=myscanner.nextInt();
        int sum=0,temp;
        temp=num;
        while(num>0)
        {
            int rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if(temp==sum)
        {
            System.out.println("The number is a palindrome");
        }
        else
        {
            System.out.println("The number is not a palindrome");
        }
        
    }
}
