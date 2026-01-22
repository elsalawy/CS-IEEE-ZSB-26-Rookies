import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int repet=s.nextInt();              // no. of repetition
        while(repet-->0){
        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a==b+c || b==a+c || c==a+b )
            System.out.println("YES");
        else
            System.out.println("NO"); 
    }   
}
}
