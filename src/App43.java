import java.util.Arrays;
import java.util.Scanner;

public class App43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int T = scanner.nextInt();
        int[] people = new int[T];
        for (int i = 0; i < T; i++) {
            int ppl = scanner.nextInt();
            people[i]=ppl;
        }
        Arrays.sort(people);
        System.out.println(people[T-1]);
    }
}