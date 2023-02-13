package Dormitory;

import java.util.*;

class Sortbyroll implements Comparator<Student> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b) {
        return compare(a, b);
    }
}

class Dorm_Room extends Buildings {
    static int studcounter;
    static int bedcounter = 0;
    String roomName;

    public static HashMap<String, ArrayList<String>> students_dorm = new HashMap<>();
    public static ArrayList<String> rooms = new ArrayList<>();

    public static void display() {
        students_dorm.forEach((a, b) -> System.out.println(a + " | " + b));
    }

    public static void addRoom(String rm) {
        rooms.add(rm);

    }

    static void addtoBuilding(String buildingName) {
        BuildingRooms.put(buildingName, rooms);
    }

    public boolean dormIsEmpty(String roomName) {
        if (rooms.contains(roomName)) {
            if (!students_dorm.containsKey(roomName)) {
                System.out.println("is empty");
                return true;
            }
        } else {
            System.out.println("there is no room with that name");
        }
        System.out.println("has students");
        return false;
    }

    public static String isInbluilding(String roomName) {
        for (String s : BuildingRooms.keySet()) {
            ArrayList<String> room = BuildingRooms.get(s);
            if (room.contains(roomName)) {
                return s;
            }
        }
        return "not found";
    }

    public static int addStudentToDorm(String DormName, String stud) {
        // students_dorm.get("dorm1").add(stud.getUserName());
        if (rooms.contains(DormName)) {
            if (students_dorm.containsKey(DormName)) {
                if (studcounter < 5) {
                    students_dorm.get(DormName).add("\n \tName:" + stud);
                    studcounter++;
                }
            } else {
                studcounter = 0;
                students_dorm.put(DormName, new ArrayList<String>());
                students_dorm.get(DormName).add("Name:" + stud);
                studcounter = 1;
                return studcounter;
            }
        } else {
            addRoom(DormName);
            studcounter = 0;
            students_dorm.put(DormName, new ArrayList<String>());
            students_dorm.get(DormName).add("Name:" + stud);
            studcounter = 1;
            return studcounter;
        }
        return studcounter;
    }

    class Bed extends DormMaterial {

        public static ArrayList<String> bed = new ArrayList<>();

        public void addNewBed(String name) {
            bed.add(name);
        }

        boolean isempty() {
            return true;
        }
    }
}

public class dorm_Access {

    public static void main(String[] args) {
        Dorm_Room room1 = new Dorm_Room();
        room1.roomName = "room1";
        Dorm_Room room2 = new Dorm_Room();
        room2.roomName = "room2";
        Dorm_Room roomB = new Dorm_Room();
        roomB.roomName = "roomB";
        Dorm_Room roomC = new Dorm_Room();
        roomC.roomName = "roomC";
        Dorm_Room.rooms.add(room2.roomName);
        Dorm_Room.rooms.add(roomC.roomName);
        Dorm_Room.rooms.add(room1.roomName);
        Dorm_Room.rooms.add(roomB.roomName);
        System.out.println(Dorm_Room.rooms);
        Dorm_Room.addtoBuilding("A");

        Student[] stud = {};
        for (int i = 0; i < stud.length; i++) {
            // stud[i].addStudent(stud[i].getUserName());
        }
        // Student.addToDorm();
        // Dorm_Room.display();
        // System.out.println(Dorm_Room.isInbluilding("roomC"));
        // System.out.println(Student.whereIsmyDorm("Name:F"));
        // room1.dormIsEmpty(room1.roomName);
        DormMaterial d = new DormMaterial();
        // Bed bed = new Bed();
        // bed.addToDorm();
        d.displayBed();
        d.removeMaterial("TABLE", 1, "roomC");
        d.displayBed();
        d.addMaterial("TABLE", 1, roomC.roomName);
        System.out.println();
        d.displayBed();
        // bed.displayBed();
        // System.out.println(Student.students_dorm.);
        // System.out.println(Dorm_Room.students_dorm);

    }
}
