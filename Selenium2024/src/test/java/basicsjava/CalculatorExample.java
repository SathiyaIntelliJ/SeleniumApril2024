package basicsjava;

public class CalculatorExample {
    public static void main(String[] args) {
        int a=30;
        int b=20;
        String operator="$";

        if(operator.equals("+"))
        {
            System.out.println(a+b);
        }
        else if(operator.equals("-"))
        {
            System.out.println(a-b);
        }
        else if(operator.equals("*"))
        {
            System.out.println("*");
        }
        else if(operator.equals("/"))
        {
            System.out.println(a/b);
        }
        else
        {
            System.out.println("Please give the valid operator");
        }
    }
}
