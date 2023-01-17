package lab6;

import java.util.HashMap;
import java.util.Scanner;

class Map_collection {
    public static void main(String[] args) {
        HashMap<String, String> stud = new HashMap<String, String>();
        stud.put("RU2333", "Tola");
        stud.put("RU2233", "Boona");
        stud.put("RU2133", "Dheresa");
        stud.put("RU2033", "Dabala");
        // System.out.println(stud);
        stud.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        stud.forEach((a, b) -> System.out.println(a + " | " + b));
        // System.out.println(stud.values());
        // stud.replace("RU2033", "Dabala", "Anaf");
        // System.out.printf("After replacement: %s", stud);
        System.out.println("Enter Id to find name here");
        try (Scanner read = new Scanner(System.in)) {
            String key = read.nextLine();
            System.out.printf("ID: %s  Name: %s", key, stud.get(key));
        }
        System.out.println("Input Error: \n Please Enter correct value");
    }

}
