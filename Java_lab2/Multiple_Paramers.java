package Java_lab2;

// this have both reading from keyboard and sumof multiply parameters
import java.util.Scanner;

class Multiple_Paramers {
    public void sumOf(int... num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("sum of them is: " + sum);
    }

    public static void main(String[] args) {
        Multiple_Paramers Try = new Multiple_Paramers();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter numbers of values you gonna sum up");
        int n = read.nextInt();
        int[] sum = new int[n];
        System.out.println("Enter value to add with space and hit Enter");
        for (int i = 0; i < n; i++) {
            sum[i] = read.nextInt();
        }
        Try.sumOf(sum);
        // 3

    }
}