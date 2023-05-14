/*
 * descrição: verificando a faixa etaria do usuario
 * autor: Cauã
 * data:03/05/2023
 * 
 */

import java.util.Scanner; // trazendo a classe Scanner

public class atividade4 {
    public static void main(String[]args){
        Scanner leitura = new Scanner(System.in); // instancia (incorporação da minha classe no meu codigo)
        int idade = 0;

        System.out.print("Informe a sua idade: ");
        idade = leitura.nextInt(); // metodo usado para ler numeros inteiros, "o proximo inteiro que digitar"

        if(idade == 0 || idade <=12){ // estrutura condicional, testando valores boleanos utilando o operador logico ou
            System.out.print("criaça");
        }

        else if(idade > 12 && idade <=19){
            System.out.print("adolecente");            
        }

        else if(idade > 19 && idade <=65){
            System.out.print("adulto");
        }

        else if(idade > 65){
            System.out.print("idoso");
        }

    }
}
