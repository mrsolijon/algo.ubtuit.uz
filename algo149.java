
import java.util.Scanner;

public class algo149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c=0;
        String t = scanner.nextLine();
        String[] s= t.split(" ");
        for (int i=0; i<s.length;i++){
            char[] n = s[i].toCharArray();
            if (( n[n.length-1] == 'A')&&( n[n.length-2] == 'N'))
            {
                c++;
            }
            else
                continue;
        }
        System.out.println(c );
        for (int i=0; i<s.length;i++){
            char[] n = s[i].toCharArray();
            if (( n[n.length-1] == 'A')&&( n[n.length-2] == 'N'))
            {
                System.out.println(s[i] );
            }
            else
                continue;
        }

    }
}

