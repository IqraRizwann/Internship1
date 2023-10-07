import java.util.Scanner;

public class StudentRecords {

    public static void main(String[] args) {

        RecordManage rm = new RecordManage();
        Record r = new Record();

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println(
                    "choose any one operation:\n 1: Add Student \n 2: Delete Student\n 3: Update Student \n 4: Search Student\n 5: Display Students \n 6: calculate GPA \n 7: Exit program \n Enter your selection : ");

            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("What is the Student ID Number: ");
                    int idNumber = sc.nextInt();

                    System.out.print("What is the Student Contact Number: ");
                    long contactNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.print("What is the Student Name: ");
                    String name = sc.nextLine();

                    System.out.println("What is the GPA?");
                    double g = sc.nextDouble();

                    r = new Record(name, idNumber, contactNumber, g);
                    rm.add(r);
                    System.out.println(r.toString());
                    break;
                }

                case 2: {
                    System.out.println("What is the student id number:");
                    int id = sc.nextInt();
                    rm.delete(id);
                    break;
                }

                case 3: {
                    System.out.println("What is student id number:");
                    int id = sc.nextInt();
                    rm.update(id, sc);
                    break;
                }

                case 4: {
                    System.out.println("What is student id number:");
                    int id = sc.nextInt();
                    if (!rm.find(id)) {
                        System.out.println("does not exist");
                    }
                    break;
                }

                case 5: {
                    rm.display();
                    break;
                }
                case 6: {
                    System.out.println("What is student id number:");
                    int id = sc.nextInt();
                    rm.calculateGPA(id, sc);
                    break;
                }
                case 7: {
                    System.out.println("Exiting");
                    break;
                }
                default:
                    System.out.println("Invalid input");
                    break;
            }

        } while (choice != 6);

    }
}