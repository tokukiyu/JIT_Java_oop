package Dormitory;

import java.io.IOException;
import java.util.*;

public class Buildings implements Constants {
    static int key;
    public static ArrayList<String> buildingW = new ArrayList<>();
    public static ArrayList<String> buildingM = new ArrayList<>();
    public static Map<String, ArrayList<String>> Zone = new HashMap<>();
    public static Map<String, ArrayList<String>> BuildingRooms = new HashMap<>();
    public static Map<String, Set<String>> PrococtersOfBuilding = new HashMap<>();

    Buildings() {
        defaults();
    }

    void defaults() {
        addBuildingW("A3");
        addBuildingW("A1");
        addBuildingW("A2");
        addBuildingM("B0");
        addBuildingM("B2");
        addBuildingM("B1");
        addZone("female");
        addZone("male");
    }

    static void addBuildingW(String name) {
        buildingW.add(name);
    }

    static void addBuildingM(String name) {
        buildingM.add(name);
    }

    static void addZone(String Type) {
        if (Type == "female" || Type == "M" || Type == "Female")
            Zone.put(BUILDING_F, buildingW);
        else
            Zone.put(BUILDING_M, buildingM);
    }

    static void DisplayBuilding() {
        Zone.forEach((a, b) -> System.out.println("\t\t" + a + " | " + b));
    }

    static void DisplayBuildingWithProctor() {
        PrococtersOfBuilding.forEach((a, b) -> System.out.println("\t\t" + a + " | " + b));
    }

    static Set<String> proct = new HashSet<>();

    static void getProctroNameMen() {
        for (Proctor p : Proctor.proctors) {
            if (p.getGender() == "M")
                proct.add(p.getUserName());
        }
    }

    static void getProctroNameWomen() {
        for (Proctor p : Proctor.proctors) {
            if (p.getGender() != "M")
                proct.add(p.getUserName());
        }
    }

    static void addProcterToBuilding(String name) {

        for (String each : Zone.keySet()) {
            ArrayList<String> list = Zone.get(BUILDING_F);
            if (list.contains(name)) {
                getProctroNameWomen();
                break;
            } else if (!list.contains(name)) {
                getProctroNameMen();
                break;
            } else
                System.out.println("null");
        }
        PrococtersOfBuilding.put(name, proct);
    }

    static void navbar() throws InterruptedException, IOException {
        System.out.println("\n\n");
        System.out.println("\t\t 1. display building available ");
        System.out.println("\t\t 2. display Proctor with their assigned Building");
        System.out.println("\t\t 3. Add new building ");
        System.out.println("\t\t 4. Add new  Zone ");
        System.out.println("\t\t 5. Add new proctort to Building ");
        System.out.println("\t\t 6 or any key to back to homePage ");
        System.out.println("\t\t 7.exit ");
        Scanner read = new Scanner(System.in);
        int ch = read.nextInt();
        Switcher(ch);
    }

    static public void displayBuildingDetail(String name) throws InterruptedException, IOException {
        System.out.println("\t\t\t Welcome \n\t\t\t HERE ARE ABOUT DORMTORY \n");
        System.out.println("\t\t press any key you want to navigate in");
        navbar();

    }

    static void Switcher(int ch) throws InterruptedException, IOException {
        Scanner read = new Scanner(System.in);
        switch (ch) {

            case 1:
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                DisplayBuilding();

                navbar();
                break;
            case 2:
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                DisplayBuildingWithProctor();
                navbar();
                break;
            case 3:
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.print("\t Enter Building Name: ");
                String bd = read.nextLine();
                System.out.println(
                        "\t\t Add the new building to Zone "
                                + "\t\t\n Availble zone is Female and Male:" +
                                " \n \t\t Enter one of them");
                String reads = read.next();
                if (reads == "Female" || reads == "female") {
                    addBuildingW(bd);
                    addZone(BUILDING_F);
                } else if (reads == "male" || reads == "Male") {
                    addBuildingM(bd);
                    addZone(BUILDING_M);
                } else
                    navbar();
                break;
            case 4:
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("\t\t are you sure to create new zone? \n if so: Enter Zone name");
                String newZone = read.nextLine();
                Zone.put(newZone, null);
                navbar();
                break;
            case 5:
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("\t\t Enter the building name to add proctors you have in data");
                String Bd = read.next();
                addProcterToBuilding(Bd);
                System.out.println("done");
                navbar();
                break;
            case 6:
                break;
            case 7:
                break;
        }

    }
}

class tryout implements Constants {
    public static void main(String[] args) throws InterruptedException, IOException {
        Buildings bd = new Buildings();
        Admin.tringAdd();
        bd.addProcterToBuilding("B1");
        bd.addProcterToBuilding("A2");
        bd.addProcterToBuilding("A1");
        bd.addProcterToBuilding("B2");
        // Buildings.DisplayBuildingWithProctor();
        Buildings.displayBuildingDetail("A");
    }
}