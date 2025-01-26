// Hospital Class
class Hospital {
    private String name;
    private String location;

    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}

// Doctor Class
class Doctor {
    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    // Method to simulate a consultation between a doctor and a patient
    public void consult(Patient patient) {
        System.out.println(this.name + " (Doctor) is consulting with " + patient.getName() + " (Patient).");
        patient.receiveConsultation(this);
    }
}

// Patient Class
class Patient {
    private String name;
    private String medicalHistory;

    public Patient(String name, String medicalHistory) {
        this.name = name;
        this.medicalHistory = medicalHistory;
    }

    public String getName() {
        return name;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    // Method to receive consultation
    public void receiveConsultation(Doctor doctor) {
        System.out.println(this.name + " (Patient) is being seen by Dr. " + doctor.getName() + " for treatment.");
    }
}

// Main Class to Test the Implementation
public class HospitalDoctor {
    public static void main(String[] args) {
        // Creating Hospital, Doctor, and Patient objects
        Hospital hospital = new Hospital("City Hospital", "123 Main St");
        Doctor doctor = new Doctor("Dr. Smith", "Cardiology");
        Patient patient = new Patient("John Doe", "No significant medical history");

        // Simulating the consultation process
        doctor.consult(patient);
    }
}
