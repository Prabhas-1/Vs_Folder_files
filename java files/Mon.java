class Mon
{
    public static void main(String arg[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int a[]=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
         if(arr[i]%2==0){
         a[index]=arr[i];
         index++;
         }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0){
            a[index]=arr[i];
            index++;}
        }
        System.out.println("Array in Even Odd Order");
        for(int i=0;i<arr.length;i++)
        {
         System.out.print(a[i]+",");
        }
    }
}