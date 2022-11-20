import java.util.Scanner;

class Prime
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int i=1,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        System.out.println("Given Number is a Prime Number");
        else
        System.out.println("Given Number is not a Prime Number");
    }
}