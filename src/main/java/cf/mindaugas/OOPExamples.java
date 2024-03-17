package cf.mindaugas;

import examples.Dog;

public class OOPExamples {
    public static void main(String[] args) {
        // How would we represent patients in code
        // ... A patient will have the following properties: name, surname, age, healthCondition

        // We could represent the healthCondition as a string, with multiple complex substrings
        // ... indicating various things, but this representation would require us to split and index
        // ... the string each time we want to obtain a specific piece of information.
        // Patient patient1 = new Patient("John", "Johnson", 50, "Common cold;LOW;2024-03-01");
        // System.out.println(patient1.healthCondition.split(";")[0]);

        // String healthCondition = "Common cold;LOW;2024-03-01";
        // HealthCondition hc = new HealthCondition("Common cold", "MEDIUM", "2024-03-05");
        // System.out.println(hc.severity);

        // Patient patient1 = new Patient("John", "Johnson", 50, new HealthCondition("Common cold", "MEDIUM", "2024-03-05"));
        // Patient patient2 = new Patient("Peter", "Peterson", 33, new HealthCondition("N/A", "LOW", "2024-02-02"));
        // Patient patient3 = new Patient("Anna", "Pineappleson", 50, new HealthCondition("Runny nose", "MEDIUM", "2024-03-10"));

        // System.out.println(patient1.getFullName());
        // System.out.println(patient2.getFullName());
        // System.out.println(patient3.getFullName());

        // System.out.println(patient1.healthCondition);
        // System.out.println(patient2.healthCondition);
        // System.out.println(patient3.healthCondition);


        Patient[] patientsLoadedFromAFile = {
                new Patient("John", "Johnson", 50, new HealthCondition("Common cold", "MEDIUM", "2024-03-05")),
                new Patient("Peter", "Peterson", 33, new HealthCondition("N/A", "LOW", "2024-02-02")),
                new Patient("Anna", "Pineappleson", 50, new HealthCondition("Runny nose", "MEDIUM", "2024-03-10")),
        };

        System.out.println("Before filtering: ");
        for (Patient patient: patientsLoadedFromAFile) {
            System.out.println(patient.getFullName() + " - " + patient.healthCondition.severity);
        }
        System.out.println();

        System.out.println("After filtering: ");
        for (Patient patient: patientsLoadedFromAFile) {
            // if(patient.healthCondition.severity.equals("HIGH") || patient.healthCondition.severity.equals("MEDIUM")){
            if(!patient.healthCondition.severity.equals("LOW")){
                System.out.println(patient.getFullName() + " - " + patient.healthCondition.severity);
            }
        }
        System.out.println();

        // auto-generated constructor
        Employee employee = new Employee();

        Patient patient4 =  new Patient();
        patient4.name = "Max";
        patient4.setAge(500);
        System.out.println(patient4);

        // imported class from another package
        Dog dog1 = new Dog();
    }
}

class Employee {}

class HealthCondition {
    public String title;
    public String severity;
    public String diagnosisDate;

    public HealthCondition(String title, String severity, String diagnosisDate) {
        this.title = title;
        this.severity = severity;
        this.diagnosisDate = diagnosisDate;
    }

    @Override
    public String toString() {
        return "HealthCondition{" +
                "title='" + title + '\'' +
                ", severity='" + severity + '\'' +
                ", diagnosisDate='" + diagnosisDate + '\'' +
            '}';
    }
}

class Patient {
    public String name; // field / property
    public String surname;
    private Integer age;
    public HealthCondition healthCondition;

    // parametrized constructor method
    public Patient(String name, String surname, Integer age, HealthCondition healthCondition) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.healthCondition = healthCondition;
    }

    // parameterless constructor
    public Patient(){}

    public String getFullName(){
        return name + " " + surname + ", " + name.charAt(0) + "." + surname.charAt(0) + "." ;
    }

    // getter for age
    public Integer getAge(){
        return age;
    }

    // setter for age
    public void setAge(Integer newAge){
        if(newAge > 150) {
            System.out.println("Error: incorrect value for age field provided " + newAge+ ". Skipping assignment");
            return;
        }
        age = newAge;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}