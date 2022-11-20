class Main2
{  
int id;  
String name;  
void display()
{
System.out.println("Default Constructor invoked");
System.out.println(id+" "+name);
}  
}

class Main3
{
    int d=1;
    String ame="no_parameter";
    Main3()
    {
        System.out.println("No Parameter Constructor invoked");
        System.out.println(d+" "+ame);
    }
}

class Main4
{
    int i;
    String me;
    Main4(String me,int i)
    {
     System.out.println("Parameterized Constructor invoked");
     System.out.println(i+" "+me);

    }
}


class Main
{
    public static void main(String args[])
{  
//creating objects  
Main2 s1=new Main2(); 
//displaying values of the object  
s1.display();
Main3 m=new Main3();
Main4 n=new Main4("Parameterized",2);
}
}