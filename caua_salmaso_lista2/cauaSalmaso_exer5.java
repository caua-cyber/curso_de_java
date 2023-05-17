/*
 * descrição: mostrar o sucessor e antecessor de um numero digitado
 * autor:cauã
 * data:17/05/2023
*/
import java.util.Scanner;


public class cauaSalmaso_exer5 {
      public static void main(String[]args){
      //Declaração de variaveis e instancias e sua devida inicialização
      Scanner leitor = new Scanner(System.in);
      int numero = 0;

      //armazenando o numero digitado pelo usuario
      System.out.println("Digite um numero:");
      numero = leitor.nextInt();

      System.out.println("o antecessor é "+(numero-1)+"\n"+"o sucessor é "+(numero + 1));

      }
}
