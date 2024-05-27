
/*
 *   constructors of linked list
 *     LinkedList()
 *     LinkedList(Collection<? extends E> c)
 */

import java.util.LinkedList;

public class A {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<Integer>(); // first way of creating linked list
        a.add(12);
        a.add(13);
        a.add(14);
        a.add(15);

        System.out.println(a);

        LinkedList<Integer> b = new LinkedList<Integer>(a); //second way of creating linked list

        b.add(12);
        a.push(11);
        System.out.println(b);
    }
}
