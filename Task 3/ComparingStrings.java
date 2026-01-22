    import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String s1 = "";
        for (int i = 0; i < b; i++) {
            s1 += a;
        }

        String s2 = "";
        for (int i = 0; i < a; i++) {
            s2 += b;
        }

        if (s1.compareTo(s2) <= 0) {
            System.out.println(s1);
        } else {
            System.out.println(s2);
        }
    }
}
