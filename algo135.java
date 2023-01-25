import java.util.Scanner;

public class algo135 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] a = new int[n+1][m+1];
        for (int i=1; i<=n;i++) {
            for (int j = 1; j <= m; j++)
                a[i][j] = s.nextInt();
        }
        int k=s.nextInt();
        for (int i=1;i<=n;i++){
            if (i!=k){
                for (int j=1; j<=m; j++)
                {
                    System.out.print(a[i][j] + " ");
                }
            }
            else
                continue;
            System.out.println();
        }
        }

    }
