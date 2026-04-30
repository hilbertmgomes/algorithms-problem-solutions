/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Hilbert Machado Gomes - 20250020009
 */


import java.util.Scanner;

public class Media{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int soma = 0;

        int[] nums = sc.nextLine().split(" ");

        for (int i; i < nums.length; i++){
            
            soma += Integer.parseInt(nums[i]);
            
            
        }

        for (String num : nums){
            
        }

        System.out.println(soma);

    }
}
