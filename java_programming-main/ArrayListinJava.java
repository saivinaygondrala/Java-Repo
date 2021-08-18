import java.util.ArrayList;
public class ArrayListinJava {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.remove(2);
        System.out.println(list.lastIndexOf(40));
        System.out.println(list.contains(12));
        System.out.println(list.size());
        System.out.println(list.indexOf(10));
        System.out.println(list);
        list.toArray();
        
    }
    
}
