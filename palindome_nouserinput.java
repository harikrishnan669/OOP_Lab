class reverse
{
    public static void main(String args[])
    {
        String str="sdchuod";
        str=str+"#";
        int length=0;
        for(int i=0;str.charAt(i)!='#';i++)
        {
            length=length+1;
        }
        System.out.println("The length is"+ length);
        int flag=0;
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
            System.out.println("The word is a palindrome");
        }
        else
        {
            System.out.println("The word is not a palindrome");
        }
    }
    
}
