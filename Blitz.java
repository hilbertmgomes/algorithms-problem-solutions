/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Hilbert Machado Gomes - 20250020009
 */


import java.util.Scanner;

public class Blitz{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int licenciamento = sc.nextInt();
        int carteira = sc.nextInt();
        double bafometro = sc.nextDouble();

        if (licenciamento < 30 && carteira < 30 && bafometro <= 0.05){
            System.out.println("False");

        }else {
            System.out.println("True");
        }


    }
}
