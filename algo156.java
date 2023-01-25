import java.util.Scanner;

public class algo156 {
	public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String t= s.nextLine();
        int a,b;
        a=s.nextInt();
        b=s.nextInt();

        String[] m =t.split(" ");
        String ma = m[a-1];
        m[a-1]=m[b-1];
        m[b-1]=ma;
        for ( int i=0;i<m.length;i++ )
            System.out.print(m[i] + " " );


	}
}
