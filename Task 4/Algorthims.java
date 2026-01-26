import java.util.Scanner;
public class Algorthims {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        value(n);
    }

    public static void value(long y) {
        System.out.print(y + " ");
        if (y == 1) {
            return;
        } 
        else if (y % 2 == 0) {
            value(y / 2);
        } 
        else {
            value(3 * y + 1);
        }
    }
}
