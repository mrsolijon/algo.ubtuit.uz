import java.math.BigInteger;
import java.util.Scanner;

public class algo139 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int u=1,q=1, n=s.nextInt(),m=s.nextInt();
        int[][] a = new int[n+1][m+1];

        for (int i=1; i<=n;i++) {
            for (int j = 1; j <= m; j++){
                a[i][j] = s.nextInt();
                if (a[i][j]<0){
                    u=j;
                    q=i;}
                else
                    continue;
            }
        }
        for (int i=1; i<=n;i++) {
            for (int j = 1; j <= m; j++)
            {
                if (q!=i && u!=j)
                {
                    System.out.print(a[i][j]+ " ");
                }
                else
                    continue;
            }
            System.out.println();
        }
    }
}
