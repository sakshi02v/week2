public class Patient {
    // Static variable
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    // Final variable
    private final int patientID;

    // Instance variables
    private String name;
    private int age;
    private String ailment;

    // Constructor
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;

        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }
    public static void setHospitalName(String newHospitalName) {
        hospitalName = newHospitalName;
    }
    public void displayDetails() {
        // Check if the object is an instance of Patient
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("The object is not an instance of the Patient class.");
        }
    }

    public static void main(String[] args) {
        // Set the hospital name
        Patient.setHospitalName("Green Valley Hospital");

        // Create Patient instances
        Patient patient1 = new Patient("John Doe", 30, "Flu", 101);
        Patient patient2 = new Patient("Jane Smith", 25, "Fracture", 102);

       
        patient1.displayDetails();
        System.out.println();
        patient2.displayDetails();

        System.out.println("\nTotal Patients Admitted: " + Patient.getTotalPatients());
    }
}
 
    

