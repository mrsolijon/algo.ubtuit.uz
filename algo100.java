import java.util.Scanner;

public class algo100 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        int x,y,c,d;
        double S=0, P=1, Pu=1,Pum=1;
        x = s.nextInt();
        y = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();
        for (int a=1; a<=x;a++)
            S+=(a*x+4)/Math.sqrt(a+Math.log(6));
        for (int a=1; a<=y;a++)
            P*=(a*x*x+6)/Math.sin(a*x);
        for(int i=1;i<=c;i++){
            for (int j=1;j<=d;j++){
                Pu*=(i*j+y*x)/Math.sqrt(Math.pow((j*x+y),i));
            }
            Pum*=Pu;
            Pu=1;
        }
        System.out.printf("%.2f",S);
        System.out.print(" ");
        System.out.printf("%.2f",P);
        System.out.print(" ");
        System.out.printf("%.2f",Pum);
    }
}
