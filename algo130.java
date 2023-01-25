import java.util.Scanner;

public class algo130 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int MIN,MAX=0,sum=0;
        int[][] a = new int[n + 1][m+1];
        int[] a2 = new int[n + 1];
        for (int i=1; i<=n;i++) {
                for (int j=1;j<=m;j++){
                    a[i][j]=s.nextInt();
                    if (MAX<=a[i][j]){
                        MAX=a[i][j];
                    }
                    else
                        MAX=MAX;
                }
            }
        MIN=a[1][1];
        for (int i=1; i<=n;i++) {
            for (int j=1;j<=m;j++){
                sum+=a[i][j];
                if (MIN>=a[i][j]){
                    MIN=a[i][j];
                }
                else
                    MIN=MIN;
            }
            a2[i]=sum;
            sum=0;
        }
        for (int i=1;i<=n;i++){
            System.out.print(a2[i]+" ");
        }
        System.out.println("\n" + MAX + " " + MIN);
    }
}


