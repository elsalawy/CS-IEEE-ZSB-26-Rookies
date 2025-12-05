import java.util.Scanner;
public class Codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            char letter = Character.toLowerCase(sc.next().charAt(0));
            if ("codeforces".contains(letter + "")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
