import java.util.Scanner;

public class algo161 {
	public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int N= s.nextInt();
        int Ac=0,Sc=0,Lc=0,Oc=0,Mc=0;
        String[] b= new String[N];
        for ( int i=0; i<N;i++ ){
            b[i] = s.next();
            char[] a=b[i].toCharArray();
            switch ( a[0] ){
                case 'A':
                    Ac++;break;
                case 'S':
                    Sc++;break;
                case 'L':
                    Lc++;break;
                case 'O':
                    Oc++;break;
                case 'M':
                    Mc++;break;
                default:
                    continue;
            }
        }

        if ( Ac>=2 && Sc>=2 && Lc>=1 && Oc>=1 && Mc>=1 )
            System.out.println("YES" );
        else
            System.out.println("NO" );
	}
}
