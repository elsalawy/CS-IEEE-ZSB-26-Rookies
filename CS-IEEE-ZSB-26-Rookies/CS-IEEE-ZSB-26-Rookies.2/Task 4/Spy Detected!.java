import java.util.Scanner;

public class ICPC_Balloons {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- > 0) {
            int n = s.nextInt();
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = s.nextInt();
            }

            int repetied;

            if (array[0] == array[1] || array[0] == array[2]) 
            {
                repetied = array[0];
            }
            else
            {
                repetied = array[1];
            }

            int index = -1;
            for (int i = 0; i < n; i++) {
                if (array[i] != repetied) {
                    index = i + 1;
                    break;
                }
            }

            System.out.println(index);
        }
    }
}
