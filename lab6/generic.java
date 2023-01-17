package lab6;

class MaximumTest<T, L, K> {
    // determines the largest of three Comparable objects

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0) {
            max = y; // y is the largest so far
        }
        if (z.compareTo(max) > 0) {
            max = z; // z is the largest now
        }
        return max; // returns the largest object
    }

    static <L> void Display(L[] arr) {
        for (L l : arr) {
            System.out.println(l);
        }
    }

    public static void main(String args[]) {
        System.out.printf("Max of %d, %d and %d is %d\n\n",
                3, 4, 5, maximum(3, 4, 5));

        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
                6.698, 8.8, 7.7, maximum(6.6, 8.8, 7.7));

        System.out.printf("Max of %s, %s and %s is %s\n", "Man",
                "Car", "Book", maximum("Man", "Zero", "Here"));

        Integer arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        Display(arr);
         String Name[] = { "Name1", "Name2", "Name3" };
        Display(Name);
    }
}
