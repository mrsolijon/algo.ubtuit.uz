import java.util.Scanner;

public class algo157 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String t= s.nextLine();
        int a;
        a=s.nextInt();

        String[] m =t.split(" ");
        m[a-1]="TATU";

        for ( int i=0;i<m.length;i++ )
            System.out.print(m[i] + " " );


    }
}
