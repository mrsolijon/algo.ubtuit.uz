import java.util.Scanner;

public class algo107 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        double max = 0;
        double[] m = new double[n+1];
        for (int i=1; i<=n;i++){
            m[i]=s.nextInt();
            if(max<m[i]){

                max=m[i];
            }
            else
                max=max;
        }

        for (int j=1; j<=n; j++){
            m[j]=m[j]/max;
            System.out.printf("%.2f"+" ", m[j]);
        }
    }
}
