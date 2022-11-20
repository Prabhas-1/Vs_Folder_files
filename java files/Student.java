import java.util.Scanner;

class Student
{
    String sname;
    int total,s1,s2,s3,rollno;
    Student()
    {
        total=0;
    }
    public void set()
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Student Name,rollno,s1,s2,s3 ");
     sname=sc.next();
     rollno=sc.nextInt();
     s1=sc.nextInt();
     s2=sc.nextInt();
     s3=sc.nextInt();
     if(s1>50&&s2>50&&s3>50)
     total=s1+s2+s3;
    }
    public void display()
    {
        System.out.println(rollno+"\t"+sname+"\t"+s1+"\t"+s2+"\t"+s3+"\t"+total);
    }
    public static void main(String afs[])
    {
        Student s[]=new Student[3];
        System.out.println(s);
        for(int i=0;i<3;i++)
        {
            s[i]=new Student();
            s[i].set();
        }
        System.out.println("Roll no\tName\tS1\tS2\tS3\tTotal");
        for(int i=0;i<3;i++)
        {
            s[i].display();
        }
    }
}