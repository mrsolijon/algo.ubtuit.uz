import java.util.Scanner;

public class algo126 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double sum=0, k,l, n=s.nextInt();

        double[] m = new double[(int) (n + 1)];
        for (int i=1; i<=n;i++) {
            m[i] = s.nextInt();
            sum+=m[i];
        }
        sum=Math.log(sum/n);
        for (int i=1;i<=n;i++){
            if(m[i]<0){
                m[i]=sum;
            }
            else
                m[i]=m[i];
            System.out.printf("%.2f ",m[i]);
        }
    }
}

