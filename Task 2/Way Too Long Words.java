import java.util.ArrayList;
import java.util.Scanner;

public class ICPC_Balloons {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();  // no of iteration
        s.nextLine();

        while (t-- > 0) 
        {
            String str;
            str= s.nextLine();
            if (str.length()>10)
            {
                System.out.println(str.charAt(0) + "" + (str.length() - 2) + str.charAt(str.length() - 1));
            }
            else
            {
                System.out.println(str);
            }
        }
    }
}
