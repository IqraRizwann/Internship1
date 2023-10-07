import java.util.LinkedList;
import java.util.Scanner;

public class RecordManage {
    LinkedList<Record> list;

    public RecordManage() {
        list = new LinkedList<>();
    }


    public void add(Record record) {
        if (!find(record.getIdNumber())) {
            list.add(record);
        } else {
            System.out.println("Record already exist in Student Data.");
        }
    }

    public boolean find(int idNumber) {
        for (Record r : list) {
            if (r.getIdNumber() == idNumber) {
                System.out.println(r);
                return true;
            }
        }
        return false;
    }


    public void delete(int IdNumber) {
        Record del = null;
        for (Record r : list) {
            if (r.getIdNumber() == IdNumber) {
                del = r;
            }
        }

        if (del == null) {
            System.out.println("Invalid ID");
        } else {
            list.remove(del);
            System.out.println("Successfully Deleted");
        }
    }

    public Record findRecord(int idNumber) {

        for (Record l : list) {

            if (l.getIdNumber() == idNumber) {
                return l;
            }
        }

        return null;
    }

    
    public void update(int id, Scanner sc) {
        if (find(id)) {
            Record r = findRecord(id);

            System.out.println("Enter new Student id number:");
            int idNum = sc.nextInt();
            System.out.println("Enter new Student Contact Number:");
            int contact = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter new Student Name:");
            String name = sc.nextLine();

            r.setId(idNum);
            r.setContact(contact);
            r.setName(name);
            System.out.println("record updated");
        } else {
            System.out.println("Record not found");
        }
    }

    
    public void display() {
        if (list.isEmpty()) {
            System.out.println("The list has no record\n");
        }
        for (Record r : list) {
            System.out.println(r.toString());
        }
    }

    

    public void calculateGPA(int id, Scanner sc) {
        if (find(id)) {
            Record r = findRecord(id);
            System.out.print("How many classes did you have: ");
            int classes = sc.nextInt();
            String grades = "";
            int total = 0;
            int dec;

            for (int j = 0; j < classes; j++) {

                System.out.print("What is your Grade: ");
                grades = sc.nextLine();

                if (grades.equals("A")) {
                    dec = 4;
                    total += dec;

                } else if (grades.equals("B")) {
                    dec = 3;
                    total += dec;

                } else if (grades.equals("C")) {
                    dec = 2;
                    total += dec;

                } else if (grades.equals("D")) {
                    dec = 1;
                    total += dec;

                } else if (grades.equals("F")) {
                    dec = 0;
                    total += dec;

                }
            }
            double GPA = total / classes;
            System.out.println(GPA);
            r.setGpa(GPA);
        } else {
            System.out.println("Record not found.");
        }
    }
}
