import java.util.Scanner;

public class algo114 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        double pum = 1;
        double[] m = new double[n+1];
        for (int i=1; i<=n;i++){
            m[i]=s.nextInt();
            if((m[i]%2==0)||(m[i]%5==0)){
                pum*=m[i];
            }
            else
                continue;
        }

        System.out.printf("%.2f",Math.sin(pum));
    }
}