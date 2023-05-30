/*
 * autor:cauã
 * data:29/05/2023
 * descriçaõ: Somando 10 numeros e tirando sua raiz
*/

import java.util.Scanner;

public class caua_salmaso_exer6 {
    public static void main(String[]args){
        //inicialização de variaveis e instancias
        
        int numero = 0;
        Scanner leitor = new Scanner(System.in);
        int soma = 0;

//entrada de dados
    for(int cont = 1; cont <= 10; cont++){
        System.out.println("Digite o "+cont+" Numero:");
        numero = leitor.nextInt();
        soma = numero + soma;
    }

    System.out.println(soma);
    System.out.println(Math.sqrt(soma));


}
}
