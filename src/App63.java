import java.util.Scanner;

public class App63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("請輸入正整數n:");
        int n,sum;
        n = scanner.nextInt();
        sum=0;
        String ss="";
        for (int i = 1; i < n; i++) {
            if (n%i==0) {
                sum+=i;
                ss+=i;
            }
        }

        if (sum == n) {
            System.out.println("perfect");
        } else if (sum>n) {
            System.out.println("abundant");
        }else{
            System.out.println("deficient");
        }

    }
}