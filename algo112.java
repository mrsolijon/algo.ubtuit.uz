import java.util.Scanner;

public class algo112 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        double pum = 1;
        double sum = 0;
        double[] m = new double[n+1];
        for (int i=1; i<=n;i++){
            m[i]=s.nextInt();
            if(i%2==0){
                sum+=m[i];
            }
            else
                pum*=m[i];
        }

        System.out.printf("%.2f",pum/sum);
    }
}
