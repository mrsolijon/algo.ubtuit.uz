import java.util.Scanner;

public class algo124 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int max=0;
        int[] m = new int[n+1];
        for (int i=1; i<=n;i++) {
            m[i] = s.nextInt();
            if (max<=m[i] ){
                max = m[i];
            }
            else
                max=max;
        }
        int k =s.nextInt();
        for (int i=1;i<=n;i++){
            if (max == m[i]) {
                m[i]=m[k];
            }
            else
                m[i]=m[i];
        }
        for (int i=1;i<=n;i++){
            m[k]=max;
            System.out.print(m[i]+" ");
        }
    }
}
