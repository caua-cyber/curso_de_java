/*
 * descrição: verificando se o numero é par ou impar
 * autor: cauã
 * data: 17/05/2023
 */

 import java.util.Scanner;

public class cauaSalmaso_exer10 {
    public static void main(String[]args){

    //criando a instancia e inicializando as variaveis
    Scanner leitor = new Scanner(System.in);
    int numero = 0;

    System.out.println("Digite o seu numero:");
    numero = leitor.nextInt();

    if(numero % 2 == 0){
        System.out.println("numero par");
    }

    else{
        System.out.println("numero impar");
    }
    }
}
