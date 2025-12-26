import java.text.SimpleDateFormat;
import java.util.Date;

public class DischargeRecord {

    private int patientId;
    private long dischargeTime;

    public DischargeRecord(int id) {
        this.patientId = id;
        this.dischargeTime = System.currentTimeMillis();
    }

    public int getPatientId() {         //getter
        return patientId;
    }

    public long getDischargeTime() {
        return dischargeTime;
    }


      public void setPatientId(int patientId) {            //setter
        this.patientId = patientId;
    }



    public void setDischargeTime(long dischargeTime) {
        this.dischargeTime = dischargeTime;
    }


    @Override
    public String toString() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm");
        Date resultDate = new Date(dischargeTime);

        return "DischargeRecord: " +
                "patientId=" + patientId +
                ", dischargeTime=" + sdf.format(resultDate);
    }
}