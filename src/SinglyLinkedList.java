import java.util.List;

public class SinglyLinkedList {
    public ListNode head;

    public SinglyLinkedList() {
        head = null;

    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();



        singlyLinkedList.newFirst(234134);
        singlyLinkedList.newNode(1235125);
        singlyLinkedList.newNode(1235125);
        singlyLinkedList.newNode(1235125);
        singlyLinkedList.newNode(1235125);
        singlyLinkedList.newNode(1235125);
        singlyLinkedList.newNode(1235125);
        singlyLinkedList.output();

    }

    public void output() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "   next number is stupider   ");
            current = current.next;
        }
    }

    public void newFirst(int number) {
        ListNode newNode = new ListNode(number);
        newNode.next = head;
        head = newNode;

    }

    public void newNode(int numberr) {
        ListNode newNode = new ListNode(numberr);

        ListNode currentlast = head;
        while (currentlast.next != null) {
            currentlast = currentlast.next;
        }
        currentlast.next = newNode;

    }
}
