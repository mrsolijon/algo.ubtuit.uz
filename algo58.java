import java.util.Scanner;

public class algo58 {
    public static void  main(String[] args){
        Scanner s = new Scanner(System.in);
        double a,b,c,x,y;
        x=s.nextDouble();
        y=s.nextDouble();
        a=x/2;

        if ( Math.sqrt(Math.pow(x,2)+Math.pow(y,2)) <= 1 ){
            if (y<=a)
                System.out.println("yes");
            else
                System.out.println("no");

        }
        else
            System.out.println("no");

    }
}
