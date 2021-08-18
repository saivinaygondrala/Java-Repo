package LinkedLists;
import java.util.*;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.clear();
        System.out.println(list);
        Collection<String> collect=new ArrayList<String>();
        collect.add("hello");
        collect.add("welcome");
        collect.add("to java linked list");
        System.out.println(collect);
        collect.clear();
        System.out.println(collect);
        
    }
    
}
