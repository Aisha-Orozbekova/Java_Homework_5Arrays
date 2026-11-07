
import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        int size = n;
        int destroyed = 0;
        int i = 0;

        while (i < size) {
            int j = i + 1;

            while (j < size && numbers[j] == numbers[i]) {
                j++;
            }

            int count = j - i;

            if (count >= 3) {
                for (int k = j; k < size; k++) {
                    numbers[k - count] = numbers[k];
                }

                size -= count;
                destroyed += count;
                i = 0;
            } else {
                i = j;
            }
        }

        System.out.println(destroyed);
    }
}

