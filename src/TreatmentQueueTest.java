public class TreatmentQueueTest {

            public static void main(String[] args) {

                System.out.println("Emergency service queue begins");
                TreatmentQueue Tqueue = new TreatmentQueue();

                for (int i = 1; i <= 8; i++) {                      //add 8 requests so I used a loop for that
                    Tqueue.enqueue(new TreatmentRequest(i , false));

                }
                System.out.println("Initial queue: ");
                Tqueue.printQueue();           //printing the full list



                //Process 3 requests
                Tqueue.dequeue();
                Tqueue.dequeue();
                Tqueue.dequeue();


                System.out.println("\nQueue after processing 3 requests: ");
                Tqueue.printQueue();

            }



}
