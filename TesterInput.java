import java.util.Scanner;
public class TesterInput {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Choose one : ");
        System.out.print("1. Student\n2. Teacher");
        System.out.println();
        int pilihan = n.nextInt();
        n.nextLine();
        switch (pilihan) {
            case 1:
                System.out.println("---Student---");
                System.out.println("Name: ");
                String name = n.nextLine();
                System.out.println("Major: ");
                String major = n.nextLine();
                System.out.println("Age: ");
                int age = n.nextInt();
                System.out.println("Student Number: ");
                int studentNumber = n.nextInt();
                System.out.println("Score: ");
                int score = n.nextInt();
                Student s = new Student(name, major, age, studentNumber, score);
                s.print();
                break;

            case 2:
                System.out.println("---Teacher---");
                System.out.println("Choose one : ");
                System.out.print("1. Full Time\n2. Part Time");
                System.out.println();
                int pilihan2 = n.nextInt();
                n.nextLine();
                switch (pilihan2) {
                    case 1:
                        System.out.println("---Full Time---");
                        System.out.println("Name : ");
                        name = n.nextLine();
                        System.out.println("Subject : ");
                        String subject = n.nextLine();
                        System.out.println("Unit : ");
                        String unit = n.nextLine();
                        System.out.println("Age : ");
                        age = n.nextInt();
                        System.out.println("Salary : ");
                        int Salary = n.nextInt();
                        Fulltime f = new Fulltime(name, age, subject, Salary, unit);
                        f.print();
                        break;

                    case 2:
                        System.out.println("---Part Time---");
                        System.out.println("Name : ");
                        name = n.nextLine();
                        System.out.println("Subject : ");
                        subject = n.nextLine();
                        System.out.println("Age : ");
                        age = n.nextInt();
                        System.out.println("Hours Worked : ");
                        int hoursworked = n.nextInt();
                        PartTime p = new PartTime(name, age, subject, hoursworked);
                        p.print();
                        break;
                }

        }
    }
}
