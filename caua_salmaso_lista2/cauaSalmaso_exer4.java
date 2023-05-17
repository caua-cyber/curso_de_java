/*
 * descrição: troca de valores em variaveis
 * autor: cauã
 * data: 17/05/2023
*/

import java.util.Scanner;

public class cauaSalmaso_exer4{

    public static void main(String[]args){
        
        //decalração e inicialização de variaveis
        Scanner leitor = new Scanner(System.in);
        double valor2 = 0.0;
        double valor1 = 0.0;
        double valor3 = 0.0;

       System.out.println("Digite um numero para teste:");
       valor1 = leitor.nextDouble();//Pedindo a entrada da base

       System.out.println("Digite outro numero para teste:");
       valor2 = leitor.nextDouble();//Pedindo a entrada da altura

       valor3 = valor1;
       valor1 = valor2;
       valor2 = valor3;

       System.out.println("os valores trocados ficaram valor1:"+valor1+"\n"+"valor 2 ficou:"+valor2);


       

}
}