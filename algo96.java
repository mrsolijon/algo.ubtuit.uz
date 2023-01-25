import java.util.Scanner;

public class algo96 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int x,y,c,d;
        Double S=0.0,P=1.0,Sum=0.0,Pum=1.0;
        x=s.nextInt();
        y=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();
        for (int k=1; k<=x; k++)
            S = S + ((Math.pow(-1, k) * (k + 1)) / (Math.pow(k, 3) + k * k + 1));
        for (int i=1; i<=y; i++)
            P *= ((Math.pow(i, 3) + Math.abs(i - 9)) / (Math.log(i) + 7 * i));
        for (int n=1; n<=c; n++)
        {
            for (int m=1 ; m<=d; m++)
            {
                Sum=Sum+(Math.pow(-1,m)*(Math.log(m+5))/( Math.pow(m,n+3)+n*m ) );
            }
            Pum=Pum*Sum;
            Sum=0.0;
        }
        System.out.printf("%.2f",S);
        System.out.printf(" ");
        System.out.printf("%.2f",P);
        System.out.printf(" ");
        System.out.printf("%.2f",Pum);
    }
}
