package mypackage;

public class employee extends Person {
    int emplId[];

    void EmployeeName(String[] name) {
        this.names = name;
        this.emplId = IdGenerator(names);
        PersonInfo();
    }

    void PersonInfo() { // METHOD OVERRIDING IS HERE BECAUSE I HAVE PersonInfo()
                        // METHOD IN BOTH CHILD AND PARENT CLASS
        System.out.println("Student Information");
        System.out.println("student name \t || \t ID ");
        for (int a = 0; a < names.length; a++) {
            System.out.print(names[a] + "\t\t ");
            System.out.println("  \t" + emplId[a]);

        }
    }
}
