import java.util.Scanner;

public class algo163 {
	public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int max=0,b=0;
        String t= s.nextLine();
        String[] S=t.split(" ");
        for ( int i=0;i<S.length;i++ ){
            char[] a= S[i].toCharArray();
            if ( a.length>=max ){
                max=a.length;
                b=i;
            }
        }
        System.out.println(S[b] );
	}
}
