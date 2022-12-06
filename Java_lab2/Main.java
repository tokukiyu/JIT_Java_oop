package Java_lab2;

// constructor with defaul and parameters.
class Employee {
    String name, id;
    int salary;

    Employee() {
        this.name = "null";
        this.id = "null";
        this.salary = 0;
    }

    Employee(String name) {
        this.name = name;
    }

    Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        System.out.println(E1.id + E1.name + E1.salary);
        Employee E2 = new Employee("CHALA");
        System.out.println("Employee 2" + " " + E2.id + " " + E2.name + " " + E2.salary);
        Employee E3 = new Employee("JOHN", "h32 ", 10000);
        System.out.println("Employee 3" + " " + E3.id + " " + E3.name + " " + E3.salary);
    }
}