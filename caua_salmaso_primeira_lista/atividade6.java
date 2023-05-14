/*
 * descrição: Conversão do real para o dolar
 * autor: Cauã
 * data:03/05/2023
 * 
 */

import java.util.Scanner; // importando

public class atividade6 {
    public static void main(String[]args){

        Scanner leitor = new Scanner(System.in); // intancia
        Double real = 0.0; // inicialização

        System.out.print("Informe o seu Real R$: ");
        real = leitor.nextDouble(); // leitura do valor usando metodo da classe Scanner

        System.out.print("O resultado foi: USD$ "+(real/5));

    }
}
