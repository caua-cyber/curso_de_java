/*
 * descrição: calculo da area de acordo com as entradas da base e altura
 * autor: cauã
 * data: 17/05/2023
*/

import java.util.Scanner;

public class cauaSalmaso_exer3{

    public static void main(String[]args){
        
        //decalração e inicialização de variaveis
        Scanner leitor = new Scanner(System.in);
        double base = 0.0;
        double altura = 0.0;

       System.out.println("Digite a base:");
       base = leitor.nextDouble();//Pedindo a entrada da base

       System.out.println("Digite a altura:");
       altura = leitor.nextDouble();//Pedindo a entrada da altura

       System.out.println("a area é "+((base * altura) / 2));

}
}