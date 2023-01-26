import java.util.Scanner;

interface computingFaculty {
    void displayProfile();

    int getNumberofStudents();

    void displayId();
}

class SEprogram implements computingFaculty {
    String program_name;
    String Program_Id;
    static int studnetCount;

    SEprogram() {
        this.program_name = "Software Engineering";
        this.Program_Id = "jucomSE12";
    }

    public void displayProfile() {
        System.out.println(this.program_name);
        System.out.println("SE ID is: " + this.Program_Id);

    }

    public int getNumberofStudents() {
        return this.studnetCount;
    }

    public void displayId() {
        System.out.println(this.Program_Id);

    }
}

class CSprogram implements computingFaculty {
    String program_name;
    String Program_Id;
    int studnetCount;

    CSprogram() {
        this.program_name = "Computer Science";
        this.Program_Id = "jucomCS12";
    }

    public void displayProfile() {
        System.out.println(this.program_name);
        System.out.println("CS ID is: " + this.Program_Id);

    }

    public int getNumberofStudents() {
        return this.studnetCount;
    }

    public void displayId() {
        System.out.println(this.Program_Id);

    }
}

class SEStudent extends SEprogram {
    String name;
    String student_ID;
    String year;

    SEStudent(String name, String student_ID, String string) {

        this.studnetCount++;

        this.name = name;
        this.year = string;
        this.student_ID = student_ID;
    }

    SEStudent() {
        this.name = "unset";
        this.year = null;
        this.student_ID = "unset";
    }

    public int getNumberofStudents() {
        return this.studnetCount;
    }

    int calculateTotalAssesmentScore(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}

class exam {
    public static void main(String[] args) {

        SEStudent stud0 = new SEStudent("abi", "ru1211", "12:22:12");
        SEStudent stud1 = new SEStudent("abi", "ru1211", "12:22:12");
        SEStudent stud2 = new SEStudent("abi", "ru1211", "12:22:12");
        SEStudent[] Studlist = {
                new SEStudent("abi", "ru1211", "12:22:12"),
                new SEStudent("abi", "ru1211", "12:22:12"),
                new SEStudent("abi", "ru1211", "12:22:12")
        };
        SEStudent stud = new SEStudent();
        System.out.println(stud.getNumberofStudents());
        Scanner read = new Scanner(System.in);
        System.out.println("how many assesment are intering? ");
        int size;
        size = read.nextInt();
        int val, sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("enter next value");
            val = read.nextInt();
            sum += stud.calculateTotalAssesmentScore(val);
        }
        System.out.println("Your total Assmet is: " + sum);
        System.out.println("about your Dept");
        stud.displayProfile();
        System.out.println("your Dept Id is below");
        stud.displayId();
    }
}
