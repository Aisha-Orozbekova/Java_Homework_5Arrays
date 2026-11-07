import java.util.Scanner;
public class TaskD {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);

        int n = in.nextInt();
        int numbers[] = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        for(int i = 1; i < n; i++) {
            if(numbers[i] > numbers[i - 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
