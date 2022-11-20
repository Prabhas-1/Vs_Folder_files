class Main1
{
    String language;
    Main1()
    {
        this.language="java";
    }
    Main1(String language)
    {
        this.language=language;
    }
    public void getname()
    {
        System.out.println("Programming Language:"+this.language);
    }
    public static void main(String args[])
    {
        Main1 m=new Main1();
        Main1 m2=new Main1("python");

        m.getname();
        m2.getname();
    }
}