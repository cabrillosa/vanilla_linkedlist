/**
 * MainDriver - main entry point of the program.
 * 
 * Change Activities:
 * <ul>
 * <li><pre><pre> tag      version     committedby     date        changepoint</pre></li>
 * <li> <pre> 1        1.0          CabrillosA      11/11/2020  initial commit</pre></li>
 * <li> <pre> 2        1.1          CabrillosA      11/12/2020   Added World</pre></li>
 * </ul>
 * @author Artemio Cabrillos jr
 * @since 11/11/2020
 */
public class MainDriver{
    public static void main(String []args){
        Node head;

        Node node1 = new Node(5);
        Node node2 = new Node(15);
        Node node3 = new Node(25);

        //Linking
        //point head to node1  head->node1
        head = node1;
        //node1 point to the node2  head->node1->node2
        node1.next = node2;
        //node2 point to node3 head->node1->node2->node3
        node2.next = node3;

        //display -> traverse the list from head until null
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            //proceed to the next node
            temp = temp.next;
        }
        Node temp2 = head;
        while(temp2!=null){
            System.out.print(temp2.data+"->");
            //proceed to the next node
            temp2 = temp2.next;
        }
    }

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Linkedlist{
        private Node head;

        public Node createNode(){}
        public void addFirst(){}
        public void addLast(){}
        public void removeFirst(){}
        public void removeLast(){}
        public void displayList(){}
    }
}