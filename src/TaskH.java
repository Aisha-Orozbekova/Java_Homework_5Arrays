import java.util.Scanner;
public class TaskH {
    public static void main (String[] args) {
       Scanner in = new Scanner (System.in);
       int n = in.nextInt();
       int[] numbers = new int[n];
       for(int i = 0; i < n; i++) {
           numbers[i] = in.nextInt();
       }
       for(int i = 0; i < n - 1; i+=2) {
           int temp = numbers[i];
           numbers[i] = numbers[i + 1];
           numbers[i + 1] = temp;
       }
       for(int i = 0; i < n; i++) {
           System.out.println(numbers[i] + " ");
       }
    }
}
