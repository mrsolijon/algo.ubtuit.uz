import java.util.Scanner;

public class algo160 {
	public static void main (String[] args) {
        Scanner s= new Scanner(System.in);
        String t =s.nextLine();
        String[] m =t.split(" ");
        for ( int i=0;i<m.length;i++ ){
            char[] c=m[i].toCharArray();
            for ( int j=0; j<c.length;j++ ){
                if (c[j]>=65 && c[j]<=90 ){
                    c[j]+=32;
                }
                else
                    c[j]-=32;
                System.out.print(c[j] );
            }
           System.out.print( " " );
        }

	}
}
