/*
 * descrição: recebendo um numero e calculando o seu desconto de 15%
 * autor: cauã
 * data: 17/05/2023
*/

import java.util.Scanner;

public class cauaSalmaso_exer1{

    public static void main(String[]args){
        
        //decalração e inicialização de variaveis
        Scanner leitor = new Scanner(System.in);
        int numero = 0;

        //recolhendo o numero digitado
        System.out.println("Digite o seu numero:");
        numero = leitor.nextInt();

        //exibindo o numero com o calculo na impressão
        System.out.println("O numero foi "+numero+"\n"+"O numero com o desconto de 15% ficou "+numero*0.85);
    }
}