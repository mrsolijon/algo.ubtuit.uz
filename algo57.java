import java.util.Scanner;

public class algo57 {
    public static void main (String[] args){
        Scanner s =new Scanner(System.in);
        double a,b,c,d,x,y;
        x = s.nextDouble();
        y = s.nextDouble();
        c = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

        if((x>=-1)&&(x<=1)&&(y>=-1)&&(y<=1)){
            if((c<=1) && (c>=0))
                System.out.println("yes");
            else
                System.out.println("no");
        }
        else {
            System.out.println("no");
        }
    }
}

