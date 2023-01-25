import java.util.Scanner;

public class algo108 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        double[] m = new double[n+1];
        for (int i=1; i<=n;i++){
            m[i]=s.nextInt();
        }
        double min=m[1];
        for (int i=1;i<=n;i++){
            if(min>m[i]){

                min=m[i];
            }
            else
                min=min;
        }
        for (int j=1; j<=n; j++){
            m[j]=m[j]/min;
            System.out.printf("%.2f"+" ", m[j]);
        }
    }
}
