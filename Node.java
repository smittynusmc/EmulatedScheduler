
/**
 * Write a description of class Node here.
 *
 * @author (Dennis Klauder)
 * @version (9/8/15)
 */
class Node<Process>
{
    //initialization of fields
    Process value;
    Node<Process> next;

    Node(Process value, Node<Process> next){
        this.value=value;
        this.next=next;
    }


}
/**
 * access
 *
 * public - can be accessed from any class
 *
 * protected - access from subclasses OR from within the same package
 *
 * private - can be accessed ONLY from within the same class
 *
 * [default] - accessed from within the same package
 */

