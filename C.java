import java.util.LinkedList;

/*
 *  Methods for Queue data structure : 
 *      1) offer()
 *      2) poll()
 *      3) peek()
 *      4) isEmpty()
 *      5) Size()
 * 
 */

public class C {

    public static void main(String[] args) {
        LinkedList<Character> a = new LinkedList<Character>();
        System.out.println("isEmpty : " + a.isEmpty());
        System.out.println("size : " + a.size());
        a.offer('a');
        a.offer('b');
        a.offer('d');
        a.offer('e');
        a.offer('f');
        
        System.out.println("Your Queue is : " + a);
        System.out.println("removing elements by poll() method : ");
        System.out.println(a.poll());
        System.out.println(a.poll());
        System.out.println(a.poll());
        
        System.out.println("Your Queue is : " + a);
        System.out.println("isEmpty : " + a.isEmpty());

        System.out.println("size : " + a.size());


    }
}
