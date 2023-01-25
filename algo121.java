import java.util.Scanner;

public class algo121 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        double[] m = new double[n+1];
        for (int i=1; i<=n;i++){
            m[i]=s.nextInt();
        }
        int a;
        int sum=0;
        a=s.nextInt();
        for (int i=1;i<=n;i++){
            if( i<=a )
                sum=sum;
            else{
                sum+=m[i];
            }


        }
        System.out.print(sum);

    }
}
