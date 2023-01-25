import java.util.Scanner;

public class algo137 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[][] a = new int[n+1][n+1];
        for (int i=1; i<=n;i++) {
            for (int j = 1; j <= n; j++)
                a[i][j] = s.nextInt();
        }
        double sum=0,c=0, m=s.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1; j<=n; j++)
            {   if (a[i][j]%m==0){
                sum+=a[i][j];
                        c++;}
                else
                continue;
            }
        }
        System.out.printf("%.2f",sum/c);
    }

}
