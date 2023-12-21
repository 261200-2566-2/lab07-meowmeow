import java.util.Iterator;

public class Lab07 {
    public static void main(String[] args) {
        Myset<Integer> set = new Myset<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        Myset<Integer> set2 = new Myset<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println(set.containsAll(set2));
        System.out.println(set.addAll(set2));
        System.out.println(set.retainAll(set2));
        System.out.println(set.isEmpty());
        System.out.println(set.removeAll(set2));
        System.out.println(set.isEmpty());

        set.add(6);
        set.add(7);
        set.add(8);
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set.isEmpty());

        set.add(6);
        set.add(7);
        set.add(8);
        System.out.println(set.size());
        System.out.println(set.retainAll(set2));
        System.out.println(set.addAll(set2));
        System.out.println(set.size());
        System.out.println(set.contains(3));
        set.clear();

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
