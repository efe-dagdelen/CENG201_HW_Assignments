public class PatientList {

    public static class Node {
        Patient data;
        Node next;

        Node(Patient patient) {
            this.data = patient;
            this.next = null;
        }
    }

    private Node head;

    public PatientList() {               //constructor
        this.head = null;
    }


    public void addPatient(Patient p) {
        Node patient = new Node(p);          // new node(patient)
        if (head == null) {
            head = patient;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = patient;

        }

    }


    public void removePatient(int id) {
        if (head == null) {
            System.out.println("no patient to delete was found");
            return;
        }

        if (head.data.getId() == id) {
            head = head.next;
            return;
        }

        Node prev = head;
        Node current = head;

        while (current != null) {
            if (current.data.getId() == id) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }

    }


    public Patient findPatient(int id) {
        Node current = head;


        while (current != null) {
            if (current.data.getId() == id) {
                System.out.println("found patient with id " + id);    // to give information
                return current.data;
            }
            current = current.next;
        }
        return null;
    }


    public void printList() {
        if (head == null) {
            System.out.println("no patient to display");
        }
        Node current = head;
        while (current != null) {
            System.out.println("Patient id: " + current.data.getId() + " , "
            + " Name: " + current.data.getName());

            current = current.next;

        }

    }


    public void sortPatientsBySeverity() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node current = head;

            while (current.next != null) {


                if (current.data.getSeverity() < current.next.data.getSeverity()) {


                    Patient temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);

        System.out.println("The patient list was sorted according to severity level");
    }


}