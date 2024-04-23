package basicsjava;

import java.util.HashSet;
import java.util.Set;

public class CollectionsSetExample {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(20);
        System.out.println(s1);
    }
}
