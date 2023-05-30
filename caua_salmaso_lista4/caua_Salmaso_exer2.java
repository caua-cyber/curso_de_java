/*
 * autor:cauã
 * data:29/05/2023
 * descriçaõ:somando numeros que não sejam 48 ou 71
*/

import java.util.Scanner;

public class caua_Salmaso_exer2{
    public static void main(String[]args){
        
        //declaração e inicialização das variaveis e instancias
        Scanner leitor = new Scanner(System.in);
        int numero1 = 1;
        int numero2 = 1;
        int numero3 = 1;
        int soma = 0;

        //inicio
        while(soma != 48 || soma != 71){
        System.out.println("Digite O 1 numero:");
        numero1 = leitor.nextInt();

        System.out.println("Digite O 2 numero:");
        numero2 = leitor.nextInt();

        System.out.println("Digite O 3 numero:");
        numero3 = leitor.nextInt();

        soma = numero1 + numero2 + numero3;

        if(soma == 48 || soma == 71){
            break;
        }

        }

        System.out.println(soma);
    }
}