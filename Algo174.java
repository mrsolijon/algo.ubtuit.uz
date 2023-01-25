import java.util.Scanner;

public class Algo174 {

	public static void main (String[] args) {
        Scanner s= new Scanner(System.in);
        int n,K;
        n=s.nextInt();
        K=s.nextInt();
        int[][] a = new int[n+1][n+1];
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                a[i][j]=s.nextInt();
            }
        }
        int [][] c = new int[n+1][n+1];
             for ( int i = 1; i <= n; i++ ) {
                for ( int j = 1; j <= n; j++ ) {
                    for ( int k = 1; k <= n; k++ ) {
                        c[ i ][ j ] += a[ i ][ k ] * a[ k ][ j ];
                    }
                }
            }

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
	}
}
