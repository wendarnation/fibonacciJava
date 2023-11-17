package es.iessoterhernandez.daw.endes.fibonacciMain;
import java.util.Scanner;

import es.iessoterhernandez.daw.endes.fibonacci.Fibonacci;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Fibonacci fib = new Fibonacci();
        
        int num;
        
        System.out.println("Introduce la extensión de caracteres que quieres de fibonacci:");
        num = sc.nextInt();
        
        System.out.println(fib.calcularFibonacci(num));
    }
}
