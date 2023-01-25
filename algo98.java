import java.util.Scanner;

public class algo98 {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int x,y,c,d;
        double S=0,P=1,Sum=0,Pum=1;
        x=s.nextInt();
        y=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();
        for (int a=1;a<=x;a++)
            S+=(4*a+6*Math.log(a))/(Math.pow(a,2)+a);
        for (int a=1;a<=y;a++ )
            P*=Math.abs(a-6*Math.cos(a))/(Math.pow(a,2)+Math.pow(a,Math.log(a)));
        for(int k=1;k<=c;k++)
        {
            for (int a=1;a<=d;a++)
                Pum*=(a*k+x)/(Math.pow(k,2)+Math.pow(y,2));
            Sum+=Pum;
            Pum=1;
        }
        System.out.printf("%.2f",S);
        System.out.printf(" ");
        System.out.printf("%.2f",P);
        System.out.printf(" ");
        System.out.printf("%.2f",Sum);
    }
}
