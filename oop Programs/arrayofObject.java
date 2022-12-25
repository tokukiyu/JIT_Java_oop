
class Student {
    private String name;
    private int age;
    private float GPA;

    public Student(String name, int age, float GPA) {
        this.age = age;
        this.name = name;
        this.GPA = GPA;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public float getGPA() {
        return GPA;
    }

    void setAge(int a) {
        this.age = a;
    }

    public String getName() {
        return name;
    }

    void displayINfo() {
        System.out.println("NAme: " + getName() + "    Age: " + getAge() + " GPA: " + getGPA());
    }

    static Student[] sortedGPA(Student[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                Student temp;
                if ((a[i].getGPA()) < (a[j].getGPA())) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    static Student[] sortedAge(Student[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                Student temp;
                if ((a[i].getAge()) > (a[j].getAge())) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

}

public class arrayofObject {
    public static void main(String[] args) {
        Student stud[] = {
                new Student("tole", 21, 3.72f),
                new Student("chali", 20, 3.92f),
                new Student("deresa", 18, 3.12f),
                new Student("tolawaq", 19, 3.82f),
                new Student("diribe", 23, 3.62f),
        };

        System.out.println("NAme: " + "    Age: " + " GPA: ");
        for (Student student : stud) {
            student.displayINfo();
        }
        Student[] sorted = new Student[stud.length];
        sorted = Student.sortedGPA(stud);
        System.out.println("after sort");
        for (Student student : sorted) {
            student.displayINfo();
        }

    }

}
