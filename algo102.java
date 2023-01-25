import java.util.Scanner;

public class algo102 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,min=0;
        int n = s.nextInt();
        double[] m= new double[n];
        for (int i=0; i<n; i++){
            m[i]=s.nextDouble();
        }
        a =s.nextInt();
        b =s.nextInt();
        min= (int) m[1];
        for (int i=0; i<n;i++) {
            if (min>m[i]){
                min= (int) m[i];
            }
            else {
                min=min;
            }
        }
        for(int j=a-1;j<b;j++){
            m[j]=m[j]/min;
        }
        for(int i=0;i<n;i++){
            System.out.printf("%.1f"+" ",m[i]);
        }

    }
}
