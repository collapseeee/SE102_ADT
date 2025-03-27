class Student {
    //Attributes:
    private String SID;
    private String firstName;
    private String lastName;

    //Constructors:
    public Student(String SID, String fName, String lName) {
        this.SID = SID;
        this.firstName = fName;
        this.lastName =  lName;
    }
    //Methods:
    //for all arguments:
    public String toString() {
        return this.SID + " " + this.firstName + " " + this.lastName;
    }

    //for sorting SIDs:
    public int getIntegerSID() {
        return Integer.parseInt(this.SID);
    }

    //for sorting first names:
    public String getFirstName() {
        return this.firstName.toUpperCase();
    }

    //for sorting last names:
    public String getLastName() {
        return this.lastName.toUpperCase();
    }

    public String toStringForSaving() {
        return this.SID + "," + this.firstName + "," + this.lastName;
    }
} // End of Student class.