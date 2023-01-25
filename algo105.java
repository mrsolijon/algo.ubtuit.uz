import java.util.Scanner;

public class algo105 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        double[] m = new double[n+1];
        for (int i=1; i<=n;i++){
            m[i]=s.nextInt();
        }
        int a,b;
        double c=0,sum=0;
        a=s.nextInt();
        b=s.nextInt();
        for (int i=1;i<=n;i++){
            if( (i<=b) && (i>=a) )
                sum=sum;
            else{
                sum+=m[i];
                c++;
            }


        }
        sum=sum/c;
        System.out.printf("%.2f",sum);

    }
}
