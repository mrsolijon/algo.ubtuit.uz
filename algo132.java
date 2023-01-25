import java.util.Scanner;

public class algo132 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c=1,n,m,L;
            L = s.nextInt();
            int[] a = new int[L + 1];
            for (int i = 1; i <= L; i++) {
            a[i] = s.nextInt();
        }
            n=s.nextInt();
            m=s.nextInt();
            int[][] a2 = new int[n+1][m+1];
            for(int i=1;i<=n;i++){
                for (int j=1;j<=m;j++){
                    if (c<=L){
                        for (int k=1;k<=c;k++){
                        a2[i][j]=a[k];}
                        c++;
                    }
                    else{
                        a2[i][j]=0;}
                    System.out.print(a2[i][j]+" ");
                }
                System.out.print("\n");
            }
    }
}


