import java.util.Scanner;

public class algo103 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        double[] m= new double[n+1];
        for (int i=1;i<n+1;i++){
            m[i]=s.nextDouble();
        }
        int k,l,p=0;
        double sum=0;
        k=s.nextInt();
        l=s.nextInt();
        for (int j=k;j<=l;j++){
            sum+=m[j];
            p++;
        }
        sum=sum/p;
        System.out.printf("%.1f",sum);
    }
}
