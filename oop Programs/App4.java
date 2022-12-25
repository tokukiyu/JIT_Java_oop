// Java program to show the usage of
// Arrays.toString() and Arrays.deepToString()

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String[] args) {
		Integer[] a1 = { 1, 2, 3, 4, 5 };
		Integer[] a2 = { 6, 7, 8, 9, 10 };
		Integer[][] multi = { a1, a2 };
		System.out.println("Using Arrays.toString(): "
				+ Arrays.toString(multi));
		System.out.println("Using Arrays.deepToString(): "
				+ Arrays.deepToString(multi));
	}
}
