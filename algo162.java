import java.util.Scanner;

public class algo162 {
	public static void main (String[] args) {
        Scanner s= new Scanner(System.in);

        int N =s.nextInt();

        String[] m= new String[N];

        for ( int i=0; i<N; i++ )
            m[i]=s.next();

        for ( int i=0; i<N; i++ ){
            char[] a = m[i].toCharArray();
            for ( int j=0; j<a.length; j++ ){
                if (a[j]=='$')
                    continue;
                else
                    System.out.print(a[j] );
            }
            System.out.print(" ");
        }

	}
}
