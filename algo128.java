import java.util.Scanner;

public class algo128 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int sum=0,c=0,n=s.nextInt();
        int[] m = new int[n + 1];
        for (int i=1; i<=n;i++) {
            m[i] = s.nextInt();
            if(m[i]%2==0){
                sum+=m[i];
                c++;
            }

        }
        System.out.printf("%.2f",(double)sum/c);

    }
}

