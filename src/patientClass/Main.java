package patientClass;

public class Main {

    public static void main(String[] args) {
        Patient HUP000121 = new Patient("HUP000121", "Jack Smith", "M/S Oncology ICU", 54, "NBM, ALLO, PPE", "11/24/21");
        System.out.println(HUP000121.toString());
        HUP000121.setUnit("Neurology ICU");
        System.out.println(HUP000121.toString());
    }

}
