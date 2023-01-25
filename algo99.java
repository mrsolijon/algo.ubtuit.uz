import java.util.Scanner;

public class algo99 {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int x,y,c,d;
        double S=0,P=1,Sum=0,Pum=1;
        x=s.nextInt();
        y=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();
        for (int k=1;k<=x;k++)
            S+=(Math.pow(k,3)+Math.pow(Math.E,k));
        for (int a=3;a<=y;a++ )
            P*=(a*x)/Math.sqrt(Math.pow(a,2)+Math.pow(x,2));
        for(int i=1;i<=c;i++)
        {
            for (int j=1;j<=d;j++)
                Pum*=(i*x+Math.pow(j,2))/Math.sqrt(Math.pow(i,2)+j*y);
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
