/*
 * descrição: recebendo um numero e calculando o seu desconto de 15%
 * autor: cauã
 * data: 17/05/2023
*/

import java.util.Scanner;

public class cauaSalmaso_exer6{

    public static void main(String[]args){
        
        //decalração e inicialização de variaveis
        Scanner leitor = new Scanner(System.in);
        int k = 0;
        int l = 0;
        int r = 0;

       System.out.println("Digite a quantidade de picoles de kiwi:");
       k = leitor.nextInt();//recolhendo a quantidade de picoles de kiwi

       System.out.println("Digite a quantidade de picoles de laranja:");
       l = leitor.nextInt();//recolhendo a quantidade de picole de laranja

       System.out.println("Digite a quantidade de picoles de roma:");
       r = leitor.nextInt();//roma

       System.out.println("o total de roma deu:"+(r * 7.99));

    }
}