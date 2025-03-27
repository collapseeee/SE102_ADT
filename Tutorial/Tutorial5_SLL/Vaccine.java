/**
 * author: Nattikorn Sae-sue, 672115014
 * nattikorn_s@cmu.ac.th
 * files: CovidVaccine.java, Vaccine.java, Node.java, LinkedList.java and TutorialFifthMain.java
 */

public class Vaccine {
    private int doseNumber;
    private String dateTaken; // DD/MM/YYYY in String format.
    private String name;
    private String manufacturer;
    private String lotNumber;
    private String note;

    public Vaccine(int doseNumber, String date, String name, String manufacturer, String lot) {
        this.doseNumber = doseNumber;
        this.dateTaken = date;
        this.name = name;
        this.manufacturer = manufacturer;
        this.lotNumber = lot;
    }

    public void addNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "|Dose " + doseNumber + ": " + name + ", " + manufacturer + " (Lot:" + lotNumber + ")|"; 
    }

}