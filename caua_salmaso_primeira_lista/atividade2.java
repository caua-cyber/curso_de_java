/*
 * descrição: soma dos 4 numeros digitados pelo usuario
 * autor: Cauã
 * data:03/05/2023
 * 
 */

import java.util.Scanner; 

public class atividade2{
    public static void main(String[]args){
   
    Scanner ler = new Scanner(System.in); // instancia, (incorporação da classe)

    Double n1 = 0.0; // #lixo de memoria
    Double n2 = 0.0;
    Double n3 = 0.0;
    Double n4 = 0.0;

    System.out.print("Digite o 1 numero:");
    n1 = ler.nextDouble(); // metodo do objeto da instancia 

    System.out.print("Digite o 2 numero:");
    n2 = ler.nextDouble();

    System.out.print("Digite o 3 numero:");
    n3 = ler.nextDouble();

    System.out.print("Digite o 4 numero:");
    n4 = ler.nextDouble();

    System.out.print("a soma de ambos foi "+(n1+n2+n3+n4)); //impressao



    }
}