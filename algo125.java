import java.util.Scanner;

public class algo125 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int sum=0, k,l, n=s.nextInt();

        int[] m = new int[n+1];
        for (int i=1; i<=n;i++) {
            m[i] = s.nextInt();
            }
        k=s.nextInt();
        l=s.nextInt();
        for (int i=k;i<=l;i++){
            sum+=Math.pow(m[i],3);
        }
        System.out.println(sum);
        }
    }

