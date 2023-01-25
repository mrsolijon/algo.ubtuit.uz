import java.util.Scanner;

public class algo91 {


    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        double a,b,c,d;
        double S=0, P=1;
        double Sum=0, Pum=1;
        a=s.nextDouble();
        b=s.nextDouble();
        c=s.nextDouble();
        d=s.nextDouble();

        for (double m=1 ; m<=a; m++ )
        {
            S=S+( (3*Math.pow(m,3) + 4*m +5 ) / ( Math.pow(m,3) + Math.log(m) ) );
        }
        for (double k=1; k<=b; k++)
        {
            P=P*(k/( Math.pow(k,3) +7*k +5 ) );
        }
        for (double i=1; i<=c; i++)
        {
            for (double n=1; n<=d; n++ )
            {
                Pum=Pum* ( (Math.log(i)+Math.pow(n,i))/(Math.pow(n,i) ) );
            }
            Sum=Sum+Pum;
            Pum=1;
        }

        System.out.printf("%.2f",S);
        System.out.print(" ");
        System.out.printf("%.2f",P);
        System.out.print(" ");
        System.out.printf("%.2f",Sum);
    }
}