import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class algo92 {


    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        double x,y,a,b;
        double S=0, P=1;
        double Sum=0, Pum=1;
        x=s.nextDouble();
        y=s.nextDouble();
        a=s.nextDouble();
        b=s.nextDouble();

       for(double i=1;i<=x;i++)
       {
           S=S+((i*i+2*i)/(i*i*i+i*Math.pow(Math.cos(i),2) +1) );
       }
       for (double i=1;i<=y;i++)
       {
       P=P*((i*i+1)/ ( Math.pow(Math.pow(i,3),(1.0/i)) +2 ) );
       }
       for (double i=1; i<=a;i++)
       {
           for(double k = 1 ; k<=b ; k++)
           {
               Pum = Pum * Math.log((Math.pow(k,i)+Math.pow(k,1.0/i) )/(Math.pow(k,3)+Math.pow(i,1.0/k) ) )    ;
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
