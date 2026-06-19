package javaframework;

import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        System.out.println(list2);

        Object arr[] = list.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        list2.addAll(list);
        System.out.println(list2);

        // Sorting the arrayList
        Collections.sort(list2);
        System.out.println(list2);
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);

        System.out.println(list2.get(4));
        System.out.println(list2.set(5, 100));

        ArrayList<Integer> list3 = (ArrayList<Integer>) list2.clone();
        System.out.println(list3);
    }
}
