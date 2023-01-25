import java.util.Scanner;

public class algo95 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int x,y,c,d;
        Double S=0.0,P=1.0,Sum=0.0,sum=0.0;
        x=s.nextInt();
        y=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();
        for (int i=1; i<=x; i++)
        {
            S=S+((Math.pow(i,4)+i*i+3)/(Math.sqrt(i+Math.pow(Math.E,i))));
        }
        for (int k=1; k<=y; k++)
        {
            sum = sum + ( (k+1) / ( Math.pow(k,3) +5*k) );
        }
        for (int m=1; m<=c; m++)
        {
            for (int n=1 ; n<=d; n++)
            {
                P=P*(Math.sqrt( Math.abs(Math.pow(m,n)-Math.pow(n,m) )/( Math.pow(m,n)+Math.pow(n,m)) ));
            }
            Sum=Sum+P;
            P=1.0;

        }
        System.out.printf("%.2f",S);
        System.out.printf(" ");
        System.out.printf("%.2f",sum);
        System.out.printf(" ");
        System.out.printf("%.2f",Sum);
    }
}
