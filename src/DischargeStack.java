

public class DischargeStack {


    private static class Node {
        DischargeRecord data;
        Node next;

        Node(DischargeRecord record) {
            this.data = record;
            this.next = null;   //When a new node is created next will be null. Because there is no next node yet just created
        }
    }

      private Node top;
    private int size;


    public DischargeStack() {
        this.top = null;
        this.size = 0;
    }

    public void push(DischargeRecord record) {
        Node nNode = new Node(record);
        nNode.next = top;
        top = nNode;
        size++;
    }

    public DischargeRecord pop() {
        if (top == null) return null;

        DischargeRecord dt = top.data;  // Remove the top element's data permanently
        top = top.next;
        size--;
        return dt;
    }

    public DischargeRecord peek() {
        return (top != null) ? top.data : null
                ;
    }

    public int size() {
        return size;
    }


    public void printStack() {

        if (top == null) {
            System.out.println("Discharge stack is empty.");
            return;
        }

        System.out.println("Discharge Stack ");
        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("Total records: " + size);

    }
}