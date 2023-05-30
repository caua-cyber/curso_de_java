/*
 * autor:cauã
 * data:29/05/2023
 * descriçaõ:somando a base da potencia divisivel por 4
*/

import java.util.Scanner;

public class caua_Salmaso_exer1{
    public static void main(String[]args){

        //declaração e inicialização das variaveis e instancias
        Scanner leitor = new Scanner(System.in);
        int numero = 1;
        int soma = 0;

        //Inicio
        while(numero != 0){
        System.out.println("Digite um numero ou 0 para encerrar:");
        numero = leitor.nextInt();

        if(Math.pow(numero,2) % 4 == 0 ){ //calculando a raiz quadrada do numero usando a classe Math e verificando se o resultado é divisivel por 4
            soma = numero + soma; //somando a valor e o acumulando
        }

        }

        System.out.println(soma);
    }
}