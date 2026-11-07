import java.util.Scanner;
public class TaskM{
    public static void main (String[]args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }

        for (int i = A - 1, j = B - 1; i < j; i++, j--) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        for (int i = C - 1, j = D - 1; i < j; i++, j--) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
