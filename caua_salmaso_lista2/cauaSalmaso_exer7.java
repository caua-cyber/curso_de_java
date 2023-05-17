/*
  *descrição:verificando o numero digitado entre o intervalo de 94 a 496
  *autor:cauã
  *data:17/05/2023
*/ 

import java.util.Scanner;

public class cauaSalmaso_exer7 {
    public static void main(String[]args){
        //declaração de instancia, variaveis e suas inicializações
        int numero = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero:");
        numero = leia.nextInt();

        if(numero >= 94 && numero <= 496){
            System.out.println("Acertou");
        }

        else{
            System.out.println("tente de novo");
        }
    }
}
