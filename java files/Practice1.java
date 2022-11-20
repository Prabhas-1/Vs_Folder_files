import java.util.Scanner;

class Practice1
{
   public static void main(String []args)
    {
      /*   Scanner sc=new Scanner(System.in);
        byte m1,m2,m3;
     System.out.println("Enter your marks in Physics:");
     m1=sc.nextByte();
     System.out.println("Enter your marks in Chemistry:");
     m2=sc.nextByte();
     System.out.println("Enter your marks in Biology:");
     m3=sc.nextByte();
     float avg=(m1+m2+m3)/3.0f;

     if(avg>=40&&m1>33&&m2>33&&m3>33)
     {
        System.out.println("Congratulations ,You have been Promoted");
     }
     else
     {
       System.out.println("Sorry ,You have been not Promoted");
     }*/
     
     Scanner sc=new Scanner(System.in);
     float tax=0,salary;

     System.out.println("Enter your Salary:");
     salary=sc.nextFloat();

     if(salary<=2.5)
     {
        tax=tax+0;
        System.out.println("Your tax is :"+tax);
     }

     else if(salary>2.5 && salary<=5)
     {
        tax=tax+0.05f*(salary-2.5f);
        System.out.println("Your tax is :"+tax);
     }
     else if(salary>5  && salary<=10)
     {
        tax=0.1f*(salary-2.5f);
        System.out.println("Your tax is :"+tax);
     }
     else
      {
        tax=.2f*(salary-2.5f);
        System.out.println("Your tax is :"+tax);
     }

    }
}