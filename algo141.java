import java.util.Scanner;

public class algo141 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] A = new int[n+1][m+1];
        for (int i=1; i<=n;i++) {
            for (int j = 1; j <= m; j++){
                A[i][j] = s.nextInt();
            }
        }
        int a=s.nextInt();
        int b=s.nextInt();
        int c=0,sum=0;
        for (int i=1; i<=n;i++) {
            for (int j = 1; j <= m; j++){
                if ((a<=A[i][j])&&(A[i][j]<=b)){
                    sum+=A[i][j];
                       c++;}
                else
                    continue;
            }
        }
        System.out.printf("%.2f",(double)sum/c);
    }
}
