

import java.util.HashMap;


public class HospitalSystem {
    private final PatientList patientList;
    private final TreatmentQueue normalQueue;
    private final TreatmentQueue priorityQueue;
    private final DischargeStack dischargeStack;
    private final HashMap<Integer, Patient> patientMap;


    public HospitalSystem() {
        patientList = new PatientList();
        normalQueue = new TreatmentQueue();
        priorityQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new HashMap<>();
    }

    public void addPatient(Patient patient) {
        patientList.addPatient(patient);
        patientMap.put(patient.getId(), patient);
    }

    public void addTreatmentRequest(TreatmentRequest request) {
        if (request.isPriority()) {
            priorityQueue.enqueue(request); // Add to priority queue.

        } else {
            normalQueue.enqueue(request);
        }

    }


    public void processTreatment() {
        TreatmentRequest request;
        if (!priorityQueue.isEmpty()) {
            request = priorityQueue.dequeue();
        } else {
            request = normalQueue.dequeue();
        }
        if (request == null) {
            System.out.println("No Treatment Request to Process");
            return;
        }

        Patient patient = patientMap.get(request.getPatientId()); // Find the patient by ID.

        if (patient != null) {
            dischargeStack.push(new DischargeRecord(patient.getId()));
            patientList.removePatient(patient.getId());

        }
    }

    public void printSystemState() {
        System.out.println("\n Admitted Patients ");
        patientList.printList();
        System.out.println("\n Normal Treatment Queue ");
        normalQueue.printQueue();
        System.out.println("\n Priority Treatment Queue");
        priorityQueue.printQueue();
        System.out.println("\n Discharge Stack ");
        dischargeStack.printStack();


    }

    public void sortPatients() {

        patientList.sortPatientsBySeverity();
        System.out.println("Patients were sorted according to severity level.");
    }

    public void addDischargeRecord(int patientId) {
        dischargeStack.push(new DischargeRecord(patientId));
    }

}


