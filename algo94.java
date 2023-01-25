import java.util.Scanner;

public class algo94 {
public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    int x,y,c,d;
    Double S=0.0,P=1.0,Sum=0.0,sum=0.0;
    x=s.nextInt();
    y=s.nextInt();
    c=s.nextInt();
    d=s.nextInt();
    for (int a=1; a<=x; a++)
    {
        S=S+(Math.pow( (2*a+Math.cos(a)),2 ) );
    }
    for (int a=1; a<=y; a++)
    {
        P=P*((a+6)/(Math.sqrt(a*a+2)) );
    }
    for (int k=1; k<=c; k++)
    {
        for (int j=1 ; j<=d; j++)
        {
            sum=sum+((k*k+j)/(Math.sqrt(k*k+j*j)));
        }
        Sum=Sum+sum;
        sum=0.0;
    }
    System.out.printf("%.2f",S);
    System.out.printf(" ");
    System.out.printf("%.2f",P);
    System.out.printf(" ");
    System.out.printf("%.2f",Sum);
}
}
