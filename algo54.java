import java.util.Scanner;

public class algo54 {
    public static void main (String[] args){
        Scanner s =new Scanner(System.in);
        double a,b,c,d,x,y;
        x = s.nextDouble();
        y = s.nextDouble();
        a = 2-Math.abs(x);
        b = 1-Math.abs(x);
        c = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

        if( (x>=0)&&(x<=2)&&(y>=0) ) {
            if ((c<=2)&&(c>=1)){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
        else if ((x<=0)&&(x>=-2)&&(y>=0)) {
            if ((c<=2)&&(c>=1)){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }

        }
        else {
            System.out.println("no");
        }
    }

}