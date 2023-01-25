import java.util.Scanner;

public class algo158 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String t= s.nextLine();
        int a=0,b=0;
        String[] m =t.split(" ");
        for ( int i=0;i<m.length;i++ ) {
            char[] w = m[i].toCharArray();
            if (w.length%2==0)
                a++;
            else
                b++;
        }
        System.out.println(a*b );
    }
}
