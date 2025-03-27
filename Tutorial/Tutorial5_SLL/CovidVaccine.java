/**
 * author: Nattikorn Sae-sue, 672115014
 * nattikorn_s@cmu.ac.th
 * files: CovidVaccine.java, Vaccine.java, Node.java, LinkedList.java and TutorialFifthMain.java
 */

public class CovidVaccine {
    private String ID;
    private String firstName;
    private String lastName;
    private Vaccine[] vaccineList;

    public CovidVaccine(String ID, String firstName, String lastName, Vaccine[] vaccineList) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.vaccineList = vaccineList;
    }

    public String getID() {
        return ID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String vaccineListToString() {
        String result = "";
        if (vaccineList.length == 0) {
            return "none.";
        }
        for (int i=0; i<=vaccineList.length-2; i++) {
            result = result + vaccineList[i] + ", ";
        }
        result = result + vaccineList[vaccineList.length-1];
        return result;
    }
    public int getVaccineCount() {
        return vaccineList.length;
    }
    @Override
    public String toString() {
        return "[ " + ID + ", " + firstName + " " + lastName +
        "\n  Vaccine Taken (" + getVaccineCount() + ") : " + vaccineListToString() + ". ]\n";
    }
}
