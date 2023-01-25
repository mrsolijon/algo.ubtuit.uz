import java.util.Scanner;

public class algo138 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max=0,min=0, n=s.nextInt();
        int[][] a = new int[n+1][n+1];
        for (int i=1; i<=n;i++) {
            for (int j = 1; j <= n; j++){
                a[i][j] = s.nextInt();
                if ((j==i)&&(max<a[i][j]))
                    max=a[i][j];
                else
                    continue;
            }
        }
        min = a[1][n];
        for (int i=1; i<=n;i++) {
            for (int j = 1; j <= n; j++){
                if (((j+i)==n+1)&&(min>a[i][j]))
                    min=a[i][j];
                else
                    continue;
            }
        }
        System.out.println(max + " "+ min);
    }

}
