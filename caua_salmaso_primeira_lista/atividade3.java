/*
 * descrição: soma dos numeros elevados ao quadrado, digitados pelo usuario
 * autor: Cauã
 * data:03/05/2023
 * 
 */

import java.util.Scanner; // chamando a classe Scanner

public class atividade3{
    public static void main(String[]args){
   
    Scanner leitor = new Scanner(System.in); // declarando instancia

    int n1 = 0; // Lixo de memorio evitado
    int n2 = 0;
    int n3 = 0;
    int n4 = 0;

    System.out.print("Digite o 1 numero:");
    n1 = leitor.nextInt(); // variavel recebe a leitura do proximo numero inteiro

    System.out.print("Digite o 2 numero:");
    n2 = leitor.nextInt();

    System.out.print("Digite o 3 numero:");
    n3 = leitor.nextInt();

    System.out.print("Digite o 4 numero:");
    n4 = leitor.nextInt();

    System.out.print("a soma de ambos foi "+((n1 ^ 2)+(n2 ^ 2)+(n3 ^ 2 )+(n4 ^ 2))); 



    }
}