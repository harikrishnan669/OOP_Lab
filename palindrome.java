import java.util.*;
class userinput
{
    public static void main(String args[])
    {
        Scanner myscanner=new Scanner(System.in);
        System.out.println("Enter the name(Input # at the end):");
        String str=myscanner.nextLine();
        int length=0;
        int flag=0;
        for(int i=0;str.charAt(i)!='#';i++)
        {
            length=length+1;
        }
        System.out.println("The length is "+ length);
        for(int i=0;i<=length/2;i++)
        {
            if(str.charAt(i)!=str.charAt(length-i-1))
            {
                 flag=0;
                break;
            }
            else
            {
                 flag=1;
            }
        }
            if(flag==1)
            {
                System.out.println("The name is a palindrome");
            }
            else
            {
                System.out.println("The name is not a palindrome");
            }
    }
}

