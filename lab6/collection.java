package lab6;

import java.util.Iterator;
import java.util.LinkedList;

public class collection {
    public static void main(String[] args) {
        // LinkedList <Integer> list= new LinkedList<Integer>();
        LinkedList<String> name = new LinkedList<String>();
        name.add("Tola");
        name.add("Chala");
        name.add("Gari");
        name.add("Fira");
        name.add("Malasa");
        name.addLast("Dheresa");
        Iterator<String> prnt = name.iterator();
        for (int i = 0; i < name.size(); i++) {
            System.out.printf("Name: %s ", prnt.next());
        }

    }

}
