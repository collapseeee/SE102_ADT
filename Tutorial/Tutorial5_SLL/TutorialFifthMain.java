/**
 * author: Nattikorn Sae-sue, 672115014
 * nattikorn_s@cmu.ac.th
 * files: CovidVaccine.java, Vaccine.java, Node.java, LinkedList.java and TutorialFifthMain.java
 */

import java.util.Random;

public class TutorialFifthMain {
    public static void main(String[] args) {
        LinkedList vaccineList = new LinkedList();
        // Students Vaccine List (generated from ChatGPT)
        CovidVaccine[] applicants = new CovidVaccine[10];
        applicants[0] = new CovidVaccine("101", "Alice", "Johnson", 
            new Vaccine[]{new Vaccine(1, "10/02/2021", "Sinovac", "SinoTech", "B123"),
                        new Vaccine(2, "10/03/2021", "Sinovac", "SinoTech", "B456")});

        applicants[1] = new CovidVaccine("102", "Bob", "Smith", 
            new Vaccine[]{new Vaccine(1, "15/02/2021", "AstraZeneca", "Astra", "A789")});

        applicants[2] = new CovidVaccine("103", "Charlie", "Davis", 
            new Vaccine[]{new Vaccine(1, "05/03/2021", "Pfizer", "BioNTech", "P101"),
                        new Vaccine(2, "05/04/2021", "Pfizer", "BioNTech", "P202")});

        applicants[3] = new CovidVaccine("104", "David", "Miller", 
            new Vaccine[]{new Vaccine(1, "20/02/2021", "Moderna", "Moderna Inc.", "M303"),
                        new Vaccine(2, "20/03/2021", "Moderna", "Moderna Inc.", "M404"),
                        new Vaccine(3, "20/09/2021", "Pfizer", "BioNTech", "P505")});

        applicants[4] = new CovidVaccine("105", "Emma", "Wilson", 
            new Vaccine[]{new Vaccine(1, "01/03/2021", "Sinopharm", "CNBG", "S606")});

        applicants[5] = new CovidVaccine("106", "Frank", "Anderson", 
            new Vaccine[]{new Vaccine(1, "18/03/2021", "Johnson & Johnson", "J&J", "J707")});

        applicants[6] = new CovidVaccine("107", "Grace", "Thomas", 
            new Vaccine[]{new Vaccine(1, "25/02/2021", "Pfizer", "BioNTech", "P808"),
                        new Vaccine(2, "25/03/2021", "Pfizer", "BioNTech", "P909")});

        applicants[7] = new CovidVaccine("108", "Henry", "Martinez", 
            new Vaccine[]{new Vaccine(1, "12/04/2021", "Moderna", "Moderna Inc.", "M1010")});

        applicants[8] = new CovidVaccine("109", "Ivy", "Garcia", 
            new Vaccine[]{new Vaccine(1, "22/02/2021", "AstraZeneca", "Astra", "A1111"),
                        new Vaccine(2, "22/04/2021", "AstraZeneca", "Astra", "A1212")});

        applicants[9] = new CovidVaccine("110", "Jack", "Brown", 
            new Vaccine[]{new Vaccine(1, "30/03/2021", "Sinovac", "SinoTech", "B1313"),
                        new Vaccine(2, "30/04/2021", "Sinovac", "SinoTech", "B1414"),
                        new Vaccine(3, "30/10/2021", "Pfizer", "BioNTech", "P1515")});
        // End of Students list

        // Insert all student objects from the appliance array to the list.
        System.out.println("Add 10 of applicants to the list: ");
        for (CovidVaccine list : applicants) {
            vaccineList.insert(list);
        }
        divider();
        // Random delete 2 of them.
        System.out.println("Random delete two of them: ");
        vaccineList.delete(randomID(101,110));
        vaccineList.delete(randomID(101,110));
        divider();
        // Traverse through the list.
        System.out.println("Traverse through the linked-list");
        vaccineList.traverse();
        divider();
        // Show the remaining applicant.
        vaccineList.showRemainingApplicants();
        divider();
        // Delete all applicants from the list.
        System.out.println("Delete all applicant.");
        vaccineList.deleteAll();
        divider();
        // Show remaining applicants.
        vaccineList.showRemainingApplicants();
        divider();
    }

    public static void divider() { // Divider method to separate output action in the console.
        System.out.println("=====================================================================================");
    }
    public static String randomID(int min, int max) {
        Random random = new Random();
        return String.valueOf(random.nextInt(max-min+1)+min);
    }
}