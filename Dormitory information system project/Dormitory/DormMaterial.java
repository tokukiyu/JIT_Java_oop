package Dormitory;

import java.util.*;

public class DormMaterial /* this may include bed, plow and mattress */ extends Dorm_Room implements Constants {
    int code = 0;

    static int tableNum;
    static int lockerNum;
    static int bedNum;

    DormMaterial() {
        this.bedNum = this.lockerNum = 5;
        this.tableNum = 2;
        defualDormWihtMaterial();
    }

    public static ArrayList<String> material = new ArrayList<>();
    public static Map<String, String> FullRoom = new HashMap<>();

    boolean hasNoMaterial(String roomName) {
        if (!FullRoom.containsKey(roomName))
            return false;
        return true;
    }

    static void defualDormWihtMaterial() {

        for (String a : rooms) {
            FullRoom.put(a, "freeBed: " + bedNum + " free locker: " + lockerNum + " free table: " + tableNum);
        }
    }

    public static void removeMaterial(String type, int num, String room) {
        switch (type) {
            case Locker: {
                if ((lockerNum = lockerNum - num) < 0) {
                    FullRoom.put(room,
                            "freeBed: " + bedNum + " free locker: " + lockerNum + " free table: " + tableNum);
                }
                System.out.println("no that much material here to remove");
                break;
            }
            case TABLE: {
                if ((tableNum = tableNum - num) >= 0)
                    FullRoom.put(room,
                            "freeBed: " + bedNum + " free locker: " + lockerNum + " free table: " + tableNum);
                else
                    System.out.println("no that much material here to remove");
                break;
            }
            case BED: {

                if ((bedNum = bedNum - num) >= 0)
                    FullRoom.put(room,
                            "freeBed: " + bedNum + " free locker: " + lockerNum + " free table: " + tableNum);
                else
                    System.out.println("no that much material here to remove");
                break;
            }
            default:
                System.out.println("no such type material here to remove");
        }
    }

    public void addMaterial(String type, int num, String room) {
        switch (type) {
            case Locker: {
                if ((lockerNum = lockerNum + num) <= 5)
                    FullRoom.put(room,
                            "freeBed: " + bedNum + " free locker: " + lockerNum + " free table: " + tableNum);
                else
                    System.out.println("it is full to add more material here");
                break;
            }
            case TABLE: {
                if ((tableNum = tableNum + num) <= 2)
                    FullRoom.put(room,
                            "freeBed: " + bedNum + " free locker: " + lockerNum + " free table: " + tableNum);
                else
                    System.out.println("it is full to add more material here");
                break;
            }
            case BED: {
                if ((bedNum = bedNum + num) <= 5)
                    FullRoom.put(room,
                            "freeBed: " + bedNum + " free locker: " + lockerNum + " free table: " + tableNum);
                else
                    System.out.println("it is full to add more material here");
                break;
            }
            default:
                System.out.println("no souch type material here");
        }
    }

    public void chechAvailableMaterial(String roomName) {
        if (rooms.contains(roomName)) {
            if (students_dorm.containsKey(roomName)) {
                for (String string : students_dorm.keySet()) {
                    if (string == roomName) {
                        ArrayList<String> students = students_dorm.get(roomName);
                        if (students.size() != 0) {
                            System.out.println("number of availabale bed is: " + (5 - students.size())
                                    + "number of available locker is: " + (5 - students.size()));
                        }
                    }

                }
            }
        }
    }

    void displayBed() {
        FullRoom.forEach((a, b) -> System.out.println(a + " | " + b));
    }
}
