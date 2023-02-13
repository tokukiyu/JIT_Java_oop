package Dormitory;

import java.io.IOException;
import java.util.Scanner;

interface AdminPage {
    void registerNewStudent();

    void addProcter();

    public void removeStudent(String name);

    void DisplayStudentList();

    void displayBuildingDetail(String name);
}

public class Admin extends PersonInfo implements AdminPage, Constants {
    static String name = "Admin";
    static String psd = "Admin";

    public void AdminLog() throws InterruptedException, IOException {
        Scanner read = new Scanner(System.in);
        System.out.println("---------welcome to admin page:------------ \n");
        System.out.print("Login to your account here; \n Enter your user name: ");
        String name = "";
        String psd = "";
        try (read) {
            try {
                name = read.next();

            } catch (Exception e) {
                System.out.println("error happen" + e.getMessage());
            }
            System.out.print("Enter password: ");
            psd = read.next();

            if (login(name, psd)) {
                System.out.println("you are logged in as admin");
                // navigation
                int ch = 0;
                while (ch != 5) {
                    System.out.println("\t\tCHOOSE WHAT TO DO");
                    System.out.println(
                            "\t1. About student:"
                                    + "\n\t2. About proctor: "
                                    + "\n\t3. About Building to system:"
                                    + "\n\t 4. Add new admin "
                                    + "\n\t5. exit");
                    ch = read.nextInt();
                    switch (ch) {
                        case 1:
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            Student.navbar();
                            break;
                        case 2:
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            Proctor.navbar();
                            break;
                        case 3:
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            Buildings.navbar();
                            break;
                        case 4:
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            AddAdmin();
                            break;
                        case 5:
                            break;
                        default:
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            System.out.println("unkown input!!");
                            break;
                    }
                }
            }
        }

    }

    boolean login(String user_Name, String password) {
        if ((user_Name.equals(name) && password.equals(psd))) {
            System.out.println("login success!!");
            return true;
        } else {
            System.out.println("The userUSER_name or password entered was not correct!");
            return false;
        }
    }

    private void AddAdmin() {
        Scanner read = new Scanner(System.in);
        String nam = "";
        String psd = "";
        System.out.print("Login to your account here; \n Enter your user name");
        try (read) {
            try {
                nam = read.next();

            } catch (Exception e) {
                System.out.println("error happen" + e.getMessage());
            }
            System.out.print("Enter password: ");
            psd = read.next();
        }
        if (login(nam, psd)) {
            Admin.name = nam;
            Admin.psd = psd;
            System.out.println("you added new admin successfully");
        }

    }

    @Override
    public void removeStudent(String name) {
        int n = 0;
        for (Student s : Student.studentsdetail) {
            if (s.getUserName() == name) {
                Student.studentsdetail.remove(s);
                n = 1;
                break;
            }
        }
        if (n == 0)
            System.out.println("not to found remove");
    }

    @Override
    public void registerNewStudent() {
        // sd Student.studentsdetail.add(null);
        Scanner read = new Scanner(System.in);
        System.out.println("Enter student information here: ");
        System.out.print("Enter Name: ");
        String name = read.nextLine();
        System.out.print("Gender M/F: ");
        String gender = read.next();
        Student student = new Student(name, gender, GenereteID(), STUDENT);
        Student.studentsdetail.add(student);
    }

    static public void tringAdd() {
        Student student = new Student("name", "M", GenereteID(), STUDENT);
        Student student1 = new Student("B", "M", GenereteID(), STUDENT);
        Student student2 = new Student("A", "F", GenereteID(), STUDENT);
        Student.studentsdetail.add(student);
        Student.studentsdetail.add(student1);
        Student.studentsdetail.add(student2);
        Proctor a = new Proctor("ad", "M", GenereteID(), ADMIN);
        Proctor b = new Proctor("ab", "F", GenereteID(), ADMIN);
        Proctor c = new Proctor("at", "M", GenereteID(), ADMIN);
        Proctor.proctors.add(c);
        Proctor.proctors.add(b);
        Proctor.proctors.add(a);
    }

    @Override
    public void addProcter() {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Proctor information here: ");
        System.out.print("Enter Name: ");
        String name = read.nextLine();
        System.out.print("Gender M/F: ");
        String gender = read.next();
        Proctor pr = new Proctor(name, gender, GenereteID(), ADMIN);
        Proctor.proctors.add(pr);

    }

    @Override
    public void DisplayStudentList() {
        for (Student s : Student.studentsdetail) {
            System.out.println(s.getUserName());
        }

    }

    @Override
    public void displayBuildingDetail(String name) {
        Buildings b = new Buildings();

    }

}

class tyring {
    public static void main(String[] args) throws InterruptedException, IOException {
        Admin a = new Admin();
        a.tringAdd();
        // a.DisplayStudentList();
        // a.removeStudent("A");
        // a.DisplayStudentList();
        a.AdminLog();
        // a.DisplayStudentList();
    }
}
