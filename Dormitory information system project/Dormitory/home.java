package Dormitory;

import java.io.IOException;
import java.util.Scanner;

/*
 * GROUP MEMBER 
 * 1.TOKUMA ABDISA RU2460/13 
 * 2. Letera Mengistu Ru2138/13
 * 3. Sena Zeleke Ru2219/13
 * 4. Betlehem Misgan RU1449/13
 * 5. Fuad  Mohammed RU1819/12
 */
public class home {
    public static void main(String[] args) throws InterruptedException, IOException {
        String ty = "";
        Scanner read = new Scanner(System.in);
        System.out.println("==========WELCOME TO DORMITORY MANAGEMENT SYSTEM");
        System.out.println("enter what type of user are you. choose \n \t1 Admin \2 Proctor \t3 tudent");
        int ch = read.nextInt();
        if (ch == 1) {
            Admin a = new Admin();
            a.tringAdd();
            // a.DisplayStudentList();
            // a.removeStudent("A");
            // a.DisplayStudentList();
            a.AdminLog();
            // a.DisplayStudentList();
        } else if (ch == 3) {
            Student s = new Student();
            s.studentPage();
        } else if (ch == 2) {

            Proctor p = new Proctor();
            p.navbar();
        } else
            System.out.println("wrong input");
    }
}
