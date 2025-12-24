public class TreatmentQueue {


    private static class QueueNode {
        TreatmentRequest data;
        QueueNode next;

        public QueueNode(TreatmentRequest request) {
            this.data = request;
            this.next = null;
        }
    }


                 private QueueNode head;                  // Pointers for the queue
                private QueueNode tail;
                private int size;


    public TreatmentQueue() {                 // Constructor
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    public void enqueue(TreatmentRequest request) {
        QueueNode nNode = new QueueNode(request);

        if (tail == null) {
            // If the queue is empty
            head = nNode;
            tail = nNode;
        } else {

            tail.next = nNode;
            tail = nNode;
        }
        size++;
    }


    public TreatmentRequest dequeue() {
        if (head == null) return null;

        TreatmentRequest data = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return data;
    }


    public int getSize() {
        return size;
    }


    public void printQueue() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println(" Patients in Queue ");
        QueueNode current = head;
        while (current != null) {
            if (current.data != null) {
                System.out.println("Patient id: " + current.data.getPatientId());
            }
            current = current.next;
        }

    }
}

