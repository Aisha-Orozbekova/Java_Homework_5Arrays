
import java.util.Scanner;

public class TaskN {

    public static void reverse(int[] numbers, int left, int right) {
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }

        int k = in.nextInt();

        int shift = ((k % n) + n) % n;

        reverse(numbers, 0, n - 1);
        reverse(numbers, 0, shift - 1);
        reverse(numbers, shift, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
