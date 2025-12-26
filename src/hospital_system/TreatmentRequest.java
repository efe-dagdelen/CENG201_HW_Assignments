package hospital_system;

public class TreatmentRequest {

    private int patientId;                        // id  of the patient
    private long arrivalTime;
    private boolean isPriority;




    public TreatmentRequest(int id , boolean isPriority) {
        this.patientId = id;
        this.arrivalTime = System.currentTimeMillis();
        this.isPriority = isPriority;

    }

    public boolean isPriority() {
        return isPriority;
    }

    public void setPriority(boolean priority) { isPriority = priority; }

    public int getPatientId() {                  //getter
        return patientId;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }

    public void setPatientId(int patientId) {      //setter
        this.patientId = patientId;
    }

    public void setArrivalTime(long arrivalTime) {
        this.arrivalTime = arrivalTime;

    }
}