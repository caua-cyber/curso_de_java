/*
 * descrição: exibição de numeros de 0 a 1000 usando o do while
 * autor:cauã
 * data:13/05/2023
 */

public class exer1{
    public static void main(String[]args){

        int cont = 0; //criação da variavel de inicio do laço, da onde ele vai partir, declaração de variavel

        do{ //falando oque o sistema vai fazer
        System.out.println(cont);
        cont++;
        }while(cont <= 1000); //passando a condição para ele executar o comando acima
    }
}