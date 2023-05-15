/*
 * descrição: media de 500 numeros usando a estrutura for
 * autor:cauã
 * data:13/05/2023
 */

import java.util.Scanner; //importando a classe Scanner

public class exer3 {

    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in); //instanciando a classe Scanner 
        int numero_somar = 0; //criando e inicializando a variavel numero_somar
        int numero_digitado = 0; //criando e inicializando a variavel numero_digitado

        for(int contador = 0; contador <=500; contador++){
            System.out.println("Digite o "+contador+" numero:");
            numero_digitado = leitor.nextInt();

            numero_somar = numero_somar + numero_digitado;
        }
        System.out.println("a media dos numeros foi de: "+numero_somar/500);

    }
}
