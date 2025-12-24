public class TreatmentQueueTest {

            public static void main(String[] args) {

                System.out.println("Emergency service queue begins");
                TreatmentQueue Tqueue = new TreatmentQueue();

                for (int i = 1; i <= 8; i++) {
                    Tqueue.enqueue(new TreatmentRequest(i));

                }
                System.out.println("Initial queue: ");
                Tqueue.printQueue();



                //Process 3 requests
                Tqueue.dequeue();
                Tqueue.dequeue();
                Tqueue.dequeue();


                System.out.println("\nQueue after processing 3 requests: ");
                Tqueue.printQueue();

            }







}
