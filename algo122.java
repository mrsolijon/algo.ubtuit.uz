import java.util.Scanner;

public class algo122 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        double sum=0,av=0;
        double[] m = new double[n+1];
        for (int i=1; i<=n;i++){
            m[i]=s.nextInt();
            sum+=Math.pow(m[i],2);
            av+=m[i];
        }
        System.out.printf("%.0f"+"\n",sum);
        System.out.printf("%.2f",av/n);
    }
}