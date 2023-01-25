import java.util.Scanner;

public class algo123 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        double sum=0;
        double[] m = new double[n+1];
        for (int i=1; i<=n;i++){
            m[i]=s.nextInt();
            if(i%2==0)
                sum+=m[i];
            else
                sum=sum;
        }
        if(sum!=0)
        for (int i=1;i<=n; i++){
            if(m[i]%2==0){
                m[i]=m[i];
            }
            else{
                m[i]=m[i]/sum;
            }
            System.out.printf("%.2f"+ " ",m[i]);
        }
        else{
            for (int i=1;i<=n; i++){
                System.out.printf("%.2f"+ " ",m[i]);
            }
        }
    }
}