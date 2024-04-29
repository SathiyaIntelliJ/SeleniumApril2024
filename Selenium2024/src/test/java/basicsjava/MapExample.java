package basicsjava;

import java.util.HashMap;
import java.util.Map;

public class MapExample
{
    public static void main(String[] args) {
        Map<Integer,String> m1=new HashMap<Integer,String>();
        m1.put(1,"Sathiya");
        m1.put(2,"IntelliJ");
        System.out.println(m1);
        System.out.println(m1.get(1));

        for(Map.Entry x:m1.entrySet())
        {
            System.out.println(x.getKey());
            System.out.println(x.getValue());
        }
    }
}
