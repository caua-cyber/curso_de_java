/*
 * autor:cauã
 * data:29/05/2023
 * descriçaõ: verificando se a quantidade de caracter é 10
*/

import java.nio.charset.Charset;
import java.util.Scanner;

public class caua_Salmaso_exer4 {
    public static void main(String[]args){
        //inicializando variaveis e instancias
        Scanner leitor = new Scanner(System.in);
        String palavra = "";

        System.out.println("Digite uma palavra");
        palavra = leitor.nextLine();

        if(palavra.length() >= 10){
            System.out.println("mais que palavrão em!");
        }

        else if(palavra.length() < 10){
            System.out.println("que palavra pequena");
        }
    }
}
