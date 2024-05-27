import java.util.LinkedList;

/*
 * 
 *   Here are the important methods for implementing
 *       a stack using the LinkedList class:
 * 
 *     1) push()
 *     2) pop()
 *     3) peek()
 *     4) size()
 * 
 * 
 * using these methods
 */


public class B {
    public static void main(String[] args) {
        LinkedList<Float> a = new LinkedList<Float>();

        System.out.println("Size of Stack : " + a.size()); // using size method

        a.push(2.12f);  // using push method
        a.push(1.2f);
        a.push(2.89f);
        a.push(24.7f);

        System.out.println(a);
        System.out.println("Size of Stack : " + a.size());

        System.out.println("\npop() method start");

        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println("Size of Stack : " + a.size());

        System.out.println("\npeek method start ~~~~~~~~");
        System.out.println(a.peek());
        System.out.println(a.peek());
        System.out.println(a.peek());
        System.out.println("Size of Stack : " + a.size());
        
    }
}
