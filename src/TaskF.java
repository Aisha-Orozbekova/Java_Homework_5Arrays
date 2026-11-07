import java.util.Scanner;
public class TaskF {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        int count = 0;

        for(int i = 1; i < n - 1; i++) {
            if(numbers[i] > numbers[i - 1 ] && numbers[i] > numbers[i+1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
