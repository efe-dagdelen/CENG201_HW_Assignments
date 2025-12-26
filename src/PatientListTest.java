public class PatientListTest {

public static void main(String[] args) {

    PatientList patientList = new PatientList();         //I created the list

    //I added 5 patients
    patientList.addPatient(new Patient(120, "Zeki Güldür", 5, 30));
    patientList.addPatient(new Patient(121,"Çağatay Han",2,25));
    patientList.addPatient(new Patient(122,"Ahmet Kaygılı",4,55));
    patientList.addPatient(new Patient(123,"Orhan Elmas",3,43));
    patientList.addPatient(new Patient(124,"Arda Cengiz",1,18));

    patientList.removePatient(122);  //removing id 122

    patientList.findPatient(124);    //finding id 124

    patientList.printList();            //printing the final state of the list

}






}
