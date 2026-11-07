import java.util.Scanner;
public class TaskI {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        if (n > 0) {
            int last = numbers[n - 1];

            for (int i = n - 1; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }

            numbers[0] = last;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

