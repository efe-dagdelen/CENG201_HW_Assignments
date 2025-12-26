

public class HospitalSystemTest {

    public static void main(String[] args) {
        HospitalSystem hs = new HospitalSystem();


        hs.addPatient(new Patient(1, "Hüseyin", 5, 33));      // Adding 10 patient with varying severity levels and ages.
        hs.addPatient(new Patient(2, "Davut", 4, 65));
        hs.addPatient(new Patient(3, "Sefa", 9, 19));
        hs.addPatient(new Patient(4, "Ali", 8, 25));
        hs.addPatient(new Patient(5, "Hasan", 1, 31));
        hs.addPatient(new Patient(6, "Enes", 2, 16));
        hs.addPatient(new Patient(7, "Ahmet", 3, 45));
        hs.addPatient(new Patient(8, "Orhan", 7, 55));
        hs.addPatient(new Patient(9, "Erhan", 5, 60));
        hs.addPatient(new Patient(10, "Yusuf", 10, 29));



        hs.addTreatmentRequest(new TreatmentRequest(1,false));          //5 priority patients and 3 normal patients were added.
        hs.addTreatmentRequest(new TreatmentRequest(2,false));
        hs.addTreatmentRequest(new TreatmentRequest(3,true));
        hs.addTreatmentRequest(new TreatmentRequest(4,true));
        hs.addTreatmentRequest(new TreatmentRequest(5,false));
        hs.addTreatmentRequest(new TreatmentRequest(6,true));
        hs.addTreatmentRequest(new TreatmentRequest(7,false));
        hs.addTreatmentRequest(new TreatmentRequest(8,false));


        System.out.println(" Before Processing Treatments ");
        hs.printSystemState();




        hs.addDischargeRecord(15);            //Add 2 discharge records.
        hs.addDischargeRecord(20);



        hs.processTreatment();                     //Process 4 treatment requests
        hs.processTreatment();
        hs.processTreatment();
        hs.processTreatment();



        hs.sortPatients();


        hs.printSystemState();







    }

}
