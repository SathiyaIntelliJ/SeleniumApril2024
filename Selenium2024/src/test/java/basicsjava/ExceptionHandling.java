package basicsjava;

public class ExceptionHandling
{
    public static void main(String[] args) {

        int a=1;
        String b="%15";
try {
    int c = Integer.parseInt(b);
    System.out.println(a + c);
}catch(NumberFormatException e)
{
   String h= b.substring(1);
   int y=Integer.parseInt(h);
    System.out.println(a + y);
}

    }


}
