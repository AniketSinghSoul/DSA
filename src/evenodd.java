import java.util.*;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i <n; i++) {
            int x = sc.nextInt();

            if (i % 2 == 0)
                evenSum += x;
            else
                oddSum += x;
        }

        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}