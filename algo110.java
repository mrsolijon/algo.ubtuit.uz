import java.util.Scanner;

public class algo110 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        double pum = 1;
        double[] m = new double[n+1];
        for (int i=1; i<=n;i++){
            m[i]=s.nextInt();
        }
        double M=s.nextInt();
        double K=s.nextInt();
        for (int i=1;i<=n;i++){
            if ((m[i]==M)||(m[i]==K)){
                pum*=m[i];
            }
            else {
                continue;
            }
        }
        System.out.printf("%.0f",pum);
    }
}
