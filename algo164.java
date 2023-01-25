import java.util.Scanner;

public class algo164 {
	public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String t = s.nextLine();
        char[] b= t.toCharArray();
        int L,R;
        L=s.nextInt();
        R=s.nextInt();
        if (L<R){
        for ( int i  = L-1; i<R;i++ ){
            System.out.print(b[i] );
        }
        }
        else
            for ( int i=L-1; i>=R-1; i-- )
                System.out.print(b[i] );
	}
}
