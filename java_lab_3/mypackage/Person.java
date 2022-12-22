package mypackage;

public class Person {
    String[] names;
    String[] days = new String[7];

    int[] IdGenerator(String[] a) {
        int id = 0;
        int[] ID = new int[a.length];
        for (String i : a) {
            ID[id] = id;
            id++;
        }
        return ID;
    }

    void PersonInfo() {
        System.out.println("Personal Information");
        System.out.println("Person name \t || \t ID ");
        int i = 0;
        for (String a : this.names) {
            System.out.print(a + "\t");
            System.out.println("\t" + i);
            i++;
        }
    }
}
