package javaframework;

import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
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

        LinkedList<Integer> list2 = new LinkedList<>();
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

        // Sorting the LinkedList
        Collections.sort(list2);
        System.out.println(list2);
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);

        System.out.println(list2.get(4));
        System.out.println(list2.set(5, 100));

        LinkedList<Integer> list3 = (LinkedList<Integer>) list2.clone();
        System.out.println(list3);
        System.out.println(list2.indexOf(100));
        System.out.println(list2.lastIndexOf(100));
        System.out.println(list2.contains(100));
        System.out.println(list2.isEmpty());
        list2.offer(200);
        System.out.println(list2);
        System.out.println(list2.isEmpty());

    }

}
