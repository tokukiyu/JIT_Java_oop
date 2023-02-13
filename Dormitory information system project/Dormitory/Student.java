package Dormitory;

import java.io.IOException;
import java.util.*;

public class Student extends PersonInfo implements Constants {
    static int studcounter;

    public static String whereIsmyDorm(String studName) {
        for (String s : Dorm_Room.students_dorm.keySet()) {
            ArrayList<String> room = Dorm_Room.students_dorm.get(s);
            if (room.contains(studName)) {
                return "you are in " + s + Dorm_Room.isInbluilding(s);
            }

        }
        return "not found";
    }

    Student(String username, String gender, int id, int type) {
        setUserName(username);
        setType(type);
        setId(id);
        setGender(gender);
    }

    public Student() {
    }

    public static ArrayList<Student> studentsdetail = new ArrayList<Student>();
    public static ArrayList<String> students = new ArrayList<>();

    public void addStudent(String stud) {
        students.add(stud);
    }

    public static void addToDorm() {
        // Collections.sort(students);
        int index = 0;
        for (String s : students) {
            if (studcounter < 5)
                studcounter = Dorm_Room.addStudentToDorm(Dorm_Room.rooms.get(index), s);
            else if (Dorm_Room.rooms.size() - 1 > index) {
                studcounter = Dorm_Room.addStudentToDorm(Dorm_Room.rooms.get(index), s);
                index++;
                System.out.println(index);
            } else
                System.out.println("no more room");
        }
        System.out.println("\t\t==========Student to dorm============ \n\n");
    }

    public static void navbar() throws InterruptedException, IOException {
        Scanner read = new Scanner(System.in);
        System.out.println("\t===========welcome to student part===============\n\n");
        System.out.println("\t\t here are your  navigatio");
        System.out.println("\t1. add new student:"
                + "\n\t2.Remove some student"
                + "\n\t3. search students dormF"
                + "\n\t4.See lists of all Student ");
        int ch = read.nextInt();
        switch (ch) {
            case 1:
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                (new Admin()).registerNewStudent();
                break;
            case 2:
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                String name = "";
                System.out.print("Enter student name to remove: ");
                (new Admin()).removeStudent(read.next());
                break;
            case 3:
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                String srch = "";
                System.out.print("Enter name to search: ");
                whereIsmyDorm(srch);
                break;
            case 4:
                // new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                (new Admin()).DisplayStudentList();
                break;
            default:
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("you entered wrong input");
                break;
        }
    }

    static void studentPage() {
        System.out.println("hello student here you can search your dorm");
        Scanner read = new Scanner(System.in);
        System.out.print("enter you username");
        String usrn = read.nextLine();
        whereIsmyDorm(usrn);
    }
}