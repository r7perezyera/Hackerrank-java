import java.io.*;
import java.util.*;
import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner entrada = new Scanner( System.in );
        int n = entrada.nextInt();
        for( int i=1; i<11; i++ ){
            System.out.println( n + " x " + i + " = " + (n*i) );
        }
    }
}
