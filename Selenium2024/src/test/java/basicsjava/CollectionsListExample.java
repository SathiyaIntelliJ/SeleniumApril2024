package basicsjava;

import java.util.ArrayList;
import java.util.List;

public class CollectionsListExample {
    public static void main(String[] args) {
//Integer
        List<Integer> l1=new ArrayList<>();
        l1.add(100);
        l1.add(200);
        l1.add(300);
        System.out.println(l1);
        l1.add(400);
        System.out.println(l1);
        l1.add(400);
        System.out.println(l1);
//String
        List<String> l2=new ArrayList<>();
        l2.add("Java");
        l2.add("Selenium");
        System.out.println(l2);
        System.out.println(l2.get(1));
        System.out.println(l1.get(2));

 //Advanced for loop
        for(String a1:l2)
        {
            System.out.println("a1 "+a1);
        }

//for loop
        for(int i=0;i<l2.size();i++)
        {
            System.out.println(l2.get(i));
        }
    }
}
