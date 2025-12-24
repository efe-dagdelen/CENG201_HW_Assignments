public class TreatmentRequest {

    private int patientId;                        // id  of the patient
    private long arrivalTime;

    public TreatmentRequest(int id) {
        this.patientId = id;
        this.arrivalTime = System.currentTimeMillis();
    }


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