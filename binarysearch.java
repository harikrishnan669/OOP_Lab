import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of elements");
        int size = scanner.nextInt();
        System.out.println("enter number in sorted order");
        int sortArr[]= new int[size];
        int i;
        for(i=0;i<size;i++)
        {
            sortArr[i]= scanner.nextInt();
        }
        System.out.println("enter number to be searched");
        int key= scanner.nextInt();
        Binarysearch bsearch = new Binarysearch(sortArr,key);
        bsearch.search();
        bsearch.result();
    }
}
 class Binarysearch
{
    private int[] arr;
    private int key;
    public  Binarysearch(int[] arr,int key)
    {
        this.arr = arr;
        this.key=key;
    }
    public int search()
    {
        int top=0;
        int bottom =arr.length-1;
        while(top<=bottom)
        {
            int mid=(top+bottom)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]<key)
            {
                top=mid+1;
            }
            else
            {
                bottom=mid-1;
            }
          }
         return -1;
    }
    protected void result()
    {
        int result=search();
     if (result != -1) {
            System.out.println(key + " found at index " + result);
        } else {
            System.out.println(key + " not found");
        }
    }
}