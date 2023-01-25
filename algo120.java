import java.util.Scanner;

public class algo120 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        double[] m = new double[n+1];
        for (int i=1; i<=n;i++){
            m[i]=s.nextInt();
        }
        int a,b;
        int c=0,sum=0;
        a=s.nextInt();
        b=s.nextInt();
        for (int i=1;i<=n;i++){
            if( (m[i]<=b) && (m[i]>=a) )
                sum=sum;
            else{
                c++;
            }


        }
        System.out.print(c);

    }
}
