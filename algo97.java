import java.util.Scanner;

public class algo97 {
    public static void main(String []args  ){
        Scanner s= new Scanner(System.in);
        int x,y,c,d;
        float S=0,P=1,Sum=0,Pum=1;
        x=s.nextInt();
        y=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();
        for (int n=1;n<=x;n++)
            S += 1.0 / (5 - 17 * n + Math.pow(n, 3));
        for(int m = 1; m<= y ; m++)
            P *= Math.sqrt(Math.abs(m - 5) + 1) / (Math.pow(m, 2) + 4 * m - 1);
        for (int i=1;i<=c;i++)
        {
            for(int k=1; k<=d; k++)
            {
                Pum *= Math.pow(-1, i) * Math.pow(Math.abs(Math.sin(k) + Math.pow(Math.E, k)), 1.0 / 7.0)/(2*Math.abs(4*Math.pow(i,3)-Math.pow(k,4)));
            }
            Sum+=Pum;
            Pum=1;
        }
        System.out.printf("%.2f",S);
        System.out.print(" ");
        System.out.printf("%.2f",P);
        System.out.print(" ");
        System.out.printf("%.2f",Sum);
    }
}
