

public class Patient {

    private final int id;                   //I defined the attributes.
    private String name;
    private int severity;
    private int age;


        public Patient(int id, String name, int severity, int age) {             //Consturctor
            this.id = id;
            this.name = name;
            this.age = age;

            if ( severity >= 1 && severity <= 10){            //I used an if-else statement because the disease level was specified in the project.
                this.severity = severity;
            }
            else {
                System.out.println("ERROR!! The disease level should be between 1 and 10. Your disease level is assigned to 1 by default.");
                this.severity = 1;
            }

        }

        public int getId() {                     //get methods
            return id;
        }
        public String getName() {
            return name;
        }
        public int getSeverity() {
            return severity;
        }
        public int getAge() {
            return age;
        }

        public void setAge(int age) {              //set methods
            this.age = age;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setSeverity(int severity) {
            this.severity = severity;
        }


}

