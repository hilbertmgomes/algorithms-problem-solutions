/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Hilbert Machado Gomes - 20250020009
 */


import java.util.Scanner;


public class Calculadora{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        char op = input.next().charAt(0);
        double n1;
        double n2;

        switch (op){
            case '+':
                n1 = input.nextDouble();
                n2 = input.nextDouble();
                System.out.println("RESULTADO: " + (n1 + n2));
                break;

            case '-':
                n1 = input.nextDouble();
                n2 = input.nextDouble();
                System.out.println("RESULTADO: " + (n1 - n2));
                break;

            case '*':
                n1 = input.nextDouble();
                n2 = input.nextDouble();
                System.out.println("RESULTADO: " + (n1 * n2));
                break;

            case '/':
                n1 = input.nextDouble();
                n2 = input.nextDouble();

                if (n2 == 0){
                    System.out.println("ERRO");

                }else {
                    System.out.println("RESULTADO: " + (n1 / n2));
                }
                break;

            default:
                System.out.println("ENTRADA INVALIDA");

        }
    }
}
