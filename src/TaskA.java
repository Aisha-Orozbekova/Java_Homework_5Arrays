import java.util.Scanner;
public class TaskA {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int numbers[] = new int [n];

        for(int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        for(int i = 0; i < n; i+=2) {
            System.out.print(numbers[i] + " ");
        }
    }
}
