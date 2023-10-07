public class Record {
    private String name;
    private int idNumber;
    private long contactNumber;
    double gpa;

    public Record(String name, int idNumber, long contactNumber2, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.contactNumber = contactNumber2;
        this.gpa = gpa;
    }

    public Record() {
    }

    public long getContact() {
        return contactNumber;
    }

    public void setContact(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setId(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getgpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {

        // Returning the record
        return "Records{"
                + "name=" + name + ", idNumber=" + idNumber
                + ", contactNumber=" + contactNumber + ",GPA=" + gpa + '}';
    }

}
