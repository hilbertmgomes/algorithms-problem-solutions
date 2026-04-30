/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Hilbert Machado Gomes - 20250020009
 */


import java.util.Scanner;

public class Sorvete{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int pos1 = sc.nextInt();
        int vel1 = sc.nextInt();
        int pos2 = sc.nextInt();
        int vel2 = sc.nextInt();
        int temp = sc.nextInt();

        int posFinal1 = pos1 + (vel1 * temp);
        int posFinal2 = pos2 + (vel2 * temp);

        int dist = posFinal1 - posFinal2;

        if (dist >= 0){
            System.out.println(dist);
        }else{
            System.out.println(dist*-1);
        }

    }
}
