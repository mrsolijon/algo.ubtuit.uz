import java.util.Scanner;

public class algo117 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int[] m = new int[n+1];
        for (int i=1; i<=n;i++){
            m[i]=s.nextInt();
            if(i%2==0){
                continue;
            }
            else
                sum+=m[i];
        }

        System.out.print(sum);
    }}