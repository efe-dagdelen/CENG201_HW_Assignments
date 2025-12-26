

public class TreatmentQueue {



    private static class QueueNode {
        TreatmentRequest data;
        QueueNode next;

        public QueueNode(TreatmentRequest request) {
            this.data = request;
            this.next = null;
        }
    }

            private QueueNode head;
         private QueueNode tail;
         private int size;

    public boolean isEmpty() {
        return size == 0;
    }


    public TreatmentQueue() {         //Initialize an empty queue.
        this.head = null;
        this.tail = null;
        this.size = 0;
    }




    public void enqueue(TreatmentRequest request) {         //Enqueue (adding the last)
        QueueNode nNode = new QueueNode(request);


        if (head == null) {          //If the queue is empty
            head = nNode;
            tail = nNode;
        }

        else if (!request.isPriority()) {
            tail.next = nNode;
            tail = nNode;
        }

        else {

            if (!head.data.isPriority()) {
                nNode.next = head;
                head = nNode;
            }
            else {

                QueueNode current = head;
                while (current.next != null && current.next.data.isPriority()) {
                    current = current.next;
                }


                nNode.next = current.next;
                current.next = nNode;


                if (nNode.next == null) {
                    tail = nNode;
                }
            }
        }
        size++;          // The size will be increased by 1 after adding a new request
    }


    public TreatmentRequest dequeue() {              //Dequeue ( removing the first)
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
        System.out.println("Waiting Line ");
        QueueNode current = head;
        while (current != null) {
            if (current.data != null) {

                String type = current.data.isPriority() ? " [priority]" : " [normal]";
                System.out.println("Patient id: " + current.data.getPatientId() + type);
            }
            current = current.next;
        }

    }


}