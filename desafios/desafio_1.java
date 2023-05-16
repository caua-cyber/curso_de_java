/*
 * descrição:menu de leitura de um numero utilizando o numero digitado como codição
 * data:16/05/2023
 * autor:cauã
*/

import java.util.Scanner;

public class desafio_1 {
    public static void main(String[]args){
        int numero1 = 1;
        int numero2 = 1;
        int numero3 = 1;
        Scanner leitor = new Scanner(System.in);
        int cont = 1;
        
        while(cont > 0){
            System.out.println("Digite 0 ou digite 1 para recomeçar:");
            cont = leitor.nextInt();

            if(cont <=0){
                break;
            }

            System.out.println("digite os 3 numero:");
            numero1 = leitor.nextInt(); //lendo os meus numeros
            numero2 = leitor.nextInt(); //lendo os meus numeros
            numero3 = leitor.nextInt(); //lendo os meus numeros

            if(numero1 > numero2 && numero1 > numero3){
                System.out.println("o mario numero é"+numero1);
            }

            else if(numero2 > numero1 && numero2 > numero3){
                System.out.println("o mario numero é"+numero2);
            }

            else if(numero3> numero2 && numero3 > numero1){
                System.out.println("o mario numero é"+numero3);
            }

        }

    }
}
