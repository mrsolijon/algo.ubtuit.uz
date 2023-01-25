import java.util.Scanner;

public class algo134 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c=0 ,n=s.nextInt();
        int m=s.nextInt();
        int[][] a = new int[n+1][m+1];
        int[] b = new int[m+1];
        for (int i=1; i<=n;i++) {
            for (int j = 1; j <= m; j++)
                a[i][j] = s.nextInt();
        }
        for (int i=1; i<=m;i++) {
                b[i] = s.nextInt();
        }
            for (int i=1; i<=n+1;i++){
                    for (int j=1; j<=m;j++){
                        if (c!=m){
                        if (a[i][1]>b[1])
                        {
                        System.out.print(a[i][j] + " ");
                        }
                        else if(a[i][1]<b[1])
                        {
                            System.out.print(b[j] + " ");
                            c++;
                        }}
                        else if (c==m)
                            System.out.print(a[i-1][j] + " ");
                    }
                System.out.println();
            }
    }
}