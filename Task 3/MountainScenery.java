import java.util.Scanner;
public class MountainScenery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int totalPoints = 2 * n + 1;
        int[] r = new int[totalPoints];
        int[] y = new int[totalPoints];
        for (int i = 0; i < totalPoints; i++)
        {
            r[i] = sc.nextInt();
            y[i] = r[i];
        }
        int remainingK = k;
        for (int i = 1; i < totalPoints - 1; i += 2)
        {
            if (remainingK > 0 && y[i] - 1 > y[i - 1] && y[i] - 1 > y[i + 1])
            {
                y[i] = y[i] - 1;
                remainingK--;
            }
        }
        for (int i = 0; i < totalPoints; i++)
        {
            System.out.print(y[i] + " ");
        }
        System.out.println();
    }
}



