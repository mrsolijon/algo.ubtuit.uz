import java.util.Scanner;

public class algo93 {
    public static void  main ( String [] args ){
        Scanner s = new Scanner(System.in);
        double x,y,a,b;
        double S=0, P=1, Sum=0,Pum=1;
        x = s.nextDouble();
        y = s.nextDouble();
        a = s.nextDouble();
        b = s.nextDouble();
        for(double k = 1 ; k<=x; k++)
        {
            S=S+( ( Math.pow(k,2) +Math.sin(k)+5 )/(Math.pow( ( Math.pow( k,7)+1) , 1.0/5.0 )  ) );
        }
        for (double n=1;n<=y;n++)
        {
            P=P*( ( n+Math.sqrt(n) ) / (n-Math.pow((n+1),1.0/5.0)));
        }
        for (double j=1;j<=a;j++)
        {
            for (double i=1;i<=b;i++)
            {
                Pum = Pum *( (Math.pow(i,2)+Math.pow((Math.pow(j,2)),1.0/i) ) / ( ( Math.sin(i)+Math.cos(j)) * Math.pow(i,j)  ) );
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
