package basicsjava;

public class VariableExample
{
    public static void main(String[] args)
    {
       NonStaticExample n=new NonStaticExample();
       n.m1();
       NonStaticExample.m2();
    }
}
