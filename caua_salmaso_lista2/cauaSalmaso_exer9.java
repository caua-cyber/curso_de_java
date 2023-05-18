/*
 * autor: cauã
 * data: 17/05/2023
 * descrição: verificar se for maior, diferentes ou iguais
*/

import java.util.Scanner;

public class cauaSalmaso_exer9 {
    public static void main(String[]args){
        
        // declaração de instancia, variaveis e suas inicializações
        Scanner leitor = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Digite o 1 numero:");
        num1 = leitor.nextInt();

        System.out.println("Digite o 2 numero:");
        num2 = leitor.nextInt();

        //verificando a igualdade e o maior e menor

        if(num1 == num2){
            System.out.println("Numeros iguais");
        }

        else if(num1 != num2 && num1 > num2){
            System.out.println("o primeiro numero é maior");
        }

        else if(num2 != num1 && num2 > num1){
            System.out.println("o segundo numero é maior");
        }

    }
}
