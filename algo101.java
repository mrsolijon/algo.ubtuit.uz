import java.util.Scanner;

public class algo101 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        double avarage1=0,avarage2=0,avarage3=0   ;
        int p=0;
        int[] m = new int[n];
        for (int i=0;i<n;i++) {
            m[i] = s.nextInt();
            avarage1+=m[i];
        }
        avarage1=avarage1/n;
        if (avarage1 != 0)
        {
            for (int i = 0; i < n; i++) {
                if (m[i] < avarage1) {
                    avarage2 += m[i];
                    p++;
                    }
                else{
                    avarage3+=m[i];
                    }
            }
            if (avarage2!=0){
                 avarage2 = avarage2/p;
                 System.out.printf("%.2f", avarage2);
            }
            else{
                System.out.print(0.00);
            }
        }
        else
        System.out.print(0.00);
    }
}
