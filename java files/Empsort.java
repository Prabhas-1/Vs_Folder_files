import java.util.*;

class Employee
{
String name;
Date appdate;
public Employee(String nm,Date apdt)
{
name=nm;
appdate=apdt;
}
public void display()
{
System.out.println(name+"\t"+appdate.getDate()+"/"+appdate.getMonth()+"/"+appdate.getYear());
}
}


class Empsort
{
public static void main(String ar[])
{
Employee e[]=new Employee[10];

e[0]=new Employee("john",new Date(2010,11,12));
e[1]=new Employee("johcwn",new Date(6001,10,12));
e[2]=new Employee("johncs",new Date(2610,11,12));
e[3]=new Employee("johndcs",new Date(5010,11,12));
e[4]=new Employee("johnc",new Date(2510,11,12));
e[5]=new Employee("johcdn",new Date(3010,11,12));
e[6]=new Employee("johndv",new Date(2910,11,12));
e[7]=new Employee("johnds",new Date(1010,11,12));
e[8]=new Employee("johntgr",new Date(1910,11,12));
e[9]=new Employee("johscn",new Date(2000,11,12));


System.out.println("List of Employees..!");
for(int i=0;i<10;i++)
{
e[i].display();
}


for(int i=0;i<10;i++)
{
for(int j=0;j<10;j++)
{
if(e[i].appdate.before(e[j].appdate))

Employee t=e[i];
e[i]=e[j];
e[j]=t;
}
}


System.out.println("List of Employees in Senority Wise");
for(int i=0;i<10;i++)
{
e[i].display();
}
}
}