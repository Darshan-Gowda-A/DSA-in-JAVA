package javaframework;

import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        System.out.println(list);

        list.push(4);
        list.push(5);
        System.out.println(list);

        System.out.println(list.pop());
        System.out.println(list.peek());
        System.out.println(list.search(3));
        System.out.println(list.isEmpty());

        // System.out.println(list.size());

        // Iterator<Integer> iterator = list.iterator();
        // while (iterator.hasNext()) {
        // System.out.println(iterator.next());
        // }

        // Stack<Integer> list2 = new Stack<>();
        // list2.add(6);
        // list2.add(7);
        // list2.add(8);
        // System.out.println(list2);

        // Object arr[] = list.toArray();
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
        // list2.addAll(list);
        // System.out.println(list2);

        // // Sorting the Stack
        // Collections.sort(list2);
        // System.out.println(list2);
        // Collections.sort(list2, Collections.reverseOrder());
        // System.out.println(list2);

        // System.out.println(list2.get(4));
        // System.out.println(list2.set(5, 100));

        // Stack<Integer> list3 = (Stack<Integer>) list2.clone();
        // System.out.println(list3);
        // System.out.println(list2.indexOf(100));
        // System.out.println(list2.lastIndexOf(100));
        // System.out.println(list2.contains(100));
        // System.out.println(list2.isEmpty());
        // // list2.offer(200);
        // System.out.println(list2);
        // System.out.println(list2.isEmpty());

    }
}
