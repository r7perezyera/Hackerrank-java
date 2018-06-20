import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );
        int i;
        double d;
        String s;
        
        i = entrada.nextInt();
        d = entrada.nextDouble();
        entrada.nextLine();       // wont work properly (read the string) without this
        s = entrada.nextLine();
        
        System.out.println( "String: " + s );
        System.out.println( "Double: " + d );
        System.out.println( "Int: " + i );
        
    }
}
