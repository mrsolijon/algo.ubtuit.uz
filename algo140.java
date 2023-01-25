import java.util.Scanner;

public class algo140 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n,m,x,y;
        n=s.nextInt();
        m=s.nextInt();
        int[][] a = new int[n+1][m+1];
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                a[i][j]=s.nextInt();
                          }
        }
        x=s.nextInt();
        y=s.nextInt();
        int[][] b = new int[x+1][y+1];
        for (int i=1;i<=x;i++){
            for (int j=1;j<=y;j++){
                b[i][j]=s.nextInt();
            }
        }
        int [][] c = new int[n+1][y+1];
        for (int i=1; i<=n; i++){
            for (int j=1; j<=y; j++){
            for (int k=1; k<=m; k++){
               c[i][j]+=a[i][k]*b[k][j];
            }
            System.out.print(c[i][j] + " ");
        }
            System.out.println();
    }
}}
