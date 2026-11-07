import java.util.Scanner;
public class TaskC {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);

        int n = in.nextInt();
        int numbers[] = new int [n];
        int count = 0;

        for(int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++) {
            if(numbers[i] > 0) {
                count++;
            }
        }
        System.out.print(count);
    }
}
