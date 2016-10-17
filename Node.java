
/**
 * Node class holds process value and keep track of the next node in a data structure
 *
 * @author Adam Tucker
 * @version (9/8/15)
 */
class Node<Process>
{

    Process value;
    Node<Process> next;

    /**
     * Constructor for Class Node
     * @param value The nodes value
     * @param next The next node in a data structure
     */
    Node(Process value, Node<Process> next){
        this.value=value;
        this.next=next;
    }


}


