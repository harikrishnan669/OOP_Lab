class freq
{
    public static void main(String args[])
    {
        String str="harikrishnan";
        char ch='i';
        str=str+'#';
        int count=0;
        for(int i=0;str.charAt(i)!='#';i++)
        {
            if(ch==str.charAt(i))
            {
                count=count+1;
            }
        }
        System.out.println("The frequency of the character is:"+ count);
    }
}
