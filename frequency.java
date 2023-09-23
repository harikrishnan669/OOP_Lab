import java.util.*;
class freq
{
    public static void main(String args[])
    {
        Scanner myscanner=new Scanner(System.in);
        System.out.println("Enter the string & Input a # symbol at the end:\n");
        String str=myscanner.nextLine();
        System.out.println("Enter a character to check the frequency:\n");
        char c=myscanner.next().charAt(0);
        int count=0;
        for(int i=0;str.charAt(i)!='#';i++)
        {
            if(c==str.charAt(i))
            {
                 count=count+1;
            }
        }
        System.out.println("The frequency of the character is:\n"+ count);
    }
}
