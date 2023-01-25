
import java.util.Scanner;

public class algo127 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int min,  n=s.nextInt();

        int[] m = new int[n + 1];
        for (int i=1; i<=n;i++) {
            m[i] = s.nextInt();
        }
        min=m[1];
        for (int i=1;i<=n;i++){
            if (min>=m[i])
                min=m[i];
            else
                min=min;
        }
        min=min*min;
        for (int i=1;i<=n;i++){
            if(m[i]<0)
                m[i]=min;
            else
                m[i]=m[i];
            System.out.print(m[i]+" ");
        }
    }
}