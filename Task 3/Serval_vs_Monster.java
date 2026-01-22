import java.util.Scanner;

public class Serval_vs_Monster {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int health = s.nextInt();
        int hits = s.nextInt();

        System.out.println((int)Math.ceil((double )health / hits));

}
}