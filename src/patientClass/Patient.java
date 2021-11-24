package patientClass;

public class Patient {

    String idn;
    String name;
    String unit;
    int age;
    String precautions;
    String date;

    public Patient(String patientId, String patientName, String patientUnit, int patientAge, String patientPrecautions, String dateCreated) {
        System.out.println("Constructor invoked!");
        idn = patientId;
        name = patientName;
        unit = patientUnit;
        age = patientAge;
        precautions = patientPrecautions;
        date = dateCreated;
    }

    public String toString() {
        return "Hello, " + name + " (" + idn + ")! You are currently staying in the " + unit + " unit. Let a nurse know if you need anything else!";
    }

    public String getIdn() {
        return idn;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDate() {
        return date;
    }

    public String getPrecautions() {
        return precautions;
    }

    public String getUnit() {
        return unit;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setIdn(String idn) {
        this.idn = idn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrecautions(String precautions) {
        this.precautions = precautions;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public static void main(String[] args) {
        Patient HUP000121 = new Patient("HUP000121", "Jack Smith", "M/S Oncology ICU", 54, "NBM, ALLO, PPE", "11/24/21");
        HUP000121.toString();
        HUP000121.setUnit("Neurology ICU");
        HUP000121.toString();
    }
}
