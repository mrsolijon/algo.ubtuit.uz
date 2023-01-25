import java.util.Scanner;

public class algo113 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        double pum = 0;
        double sum = 0;
        double[] m = new double[n+1];
        for (int i=1; i<=n;i++){
            m[i]=s.nextInt();
            if(m[i]<0){
                sum+=m[i];
                pum++;
            }
            else
                continue;
        }

        System.out.printf("%.2f",sum/pum);
    }
}
