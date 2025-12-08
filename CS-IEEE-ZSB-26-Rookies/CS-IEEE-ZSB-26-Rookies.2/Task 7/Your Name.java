import java.util.Scanner;
import java.util.Arrays;
public class ICPC_Balloons {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int x = s.nextInt(); // no. of iteration

        while (x-->0) 
        {
            s.nextInt();
            char[] str = s.next().toCharArray();
            char[] nam = s.next().toCharArray();
            Arrays.sort(str);
            Arrays.sort(nam);
            System.out.println(Arrays.equals(str, nam) ? "YES" : "NO");
        }
    }
}