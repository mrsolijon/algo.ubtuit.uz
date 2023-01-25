import java.util.Scanner;

public class algo147 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        int c=0,c2=0;
        char[] a = t.toCharArray();
        for (int i=0; i<a.length; i++){
            if (a[i] == 'A')
                c++;
            else if (a[i]=='Y')
                c2++;
            else
                continue;

        }
        System.out.println(c);
        System.out.println(c2);
    }
}
