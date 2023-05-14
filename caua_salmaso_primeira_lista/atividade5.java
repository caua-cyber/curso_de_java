/*
 * descrição: calculando o perimetro usando o raio digitado pelo usuario
 * autor: Cauã
 * data:03/05/2023
 * 
 */

import java.util.Scanner; // importando a classe Scanner

public class atividade5 {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in); //instancia (manifestação para manipular a classe no meu codigo)
        Double raio = 0.0;

        System.out.print("Digite o raio:");
        raio = leia.nextDouble(); // metodo, funcionalidade usada atraves da classe Scanner, incorporada na variavel leia

        System.out.print("o perimetro é "+((2 * 3.14) * raio));

    }
}
