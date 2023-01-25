import java.util.Scanner;

public class algo133 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int n2=n*2;
        int[][] a = new int[n+1][n+1];
        int[][] b = new int[n+1][n+1];
        for (int i=1; i<=n;i++) {
            for (int j = 1; j <= n; j++)
                a[i][j] = s.nextInt();
        }
        for (int i=1; i<=n;i++) {
            for (int j = 1; j <= n; j++)
                b[i][j] = s.nextInt();
        }
        for (int i=1; i<=n;i++){
            for (int j=1; j<=n;j++){
                System.out.print(a[i][j] + " ");
            }
            for (int j=1; j<=n;j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}


