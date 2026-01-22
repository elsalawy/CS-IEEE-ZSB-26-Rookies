import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long number = sc.nextLong();
        long base = sc.nextLong();

        if (number == 0) {
            System.out.println(1);
            return;
        }

        int count = 0;
        while (number > 0) {
            number /= base;
            count++;
        }

        System.out.println(count);
    }
}


