interface Base1
{
   public int a=10,b=10;
   public void add();
}
interface Base2
{
 public void display();
}

class Sam implements Base1,Base2
{
 public void add()
  {
   System.out.println(a+b);
  }
  public void display()
  {
   System.out.println("Hello");
  }
}

class Sample
{
    public static void main(String args[])
    {
        Sam s=new Sam();
        System.out.println(s);
        s.add();
        s.display();
    }
}