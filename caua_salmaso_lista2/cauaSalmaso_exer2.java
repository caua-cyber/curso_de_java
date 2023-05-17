/*
 * descrição: recebendo um numero e calculando o seu desconto de 15%
 * autor: cauã
 * data: 17/05/2023
*/

import java.util.Scanner;

public class cauaSalmaso_exer2{

    public static void main(String[]args){
        
        //decalração e inicialização de variaveis
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        int numero2 = 0;
        int numero3 = 0;

       System.out.println("Digite o seu 1 numero:");
       numero = leitor.nextInt();//num

       System.out.println("Digite o seu 2 numero:");
       numero2 = leitor.nextInt();//num2

       System.out.println("Digite o seu 3 numero:");
       numero3 = leitor.nextInt();//num3

        //verificando se numero é maior
       if(numero > numero2 && numero > numero3){
        System.out.println("O maior numero é "+numero);
       }

       //verificando se o numero2 é maior
       if(numero2 > numero && numero2 > numero3){
        System.out.println("O maior numero é "+numero2);
       }

       //verificando se o numero3 é maior
       if(numero3 > numero2 && numero3 > numero){
        System.out.println("O maior numero é "+numero3);
       }
    }
}