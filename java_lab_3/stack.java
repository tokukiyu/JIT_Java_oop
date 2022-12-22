public class stack {
    static int isstact(int a) {
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += i;
            if (sum == a) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int a = isstact(21);
        if (a == 1)
            System.out.println("is Stack");
        else
            System.out.println("not Stack");

    }
}
