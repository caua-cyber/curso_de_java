/*
 * descrição: exibição de numeros de 0 a 1000 SE for impar usando o do while
 * autor:cauã
 * data:13/05/2023
 */

 public class exer4{
    public static void main(String[]args){

        int cont = 0; //criação da variavel de inicio do laço, da onde ele vai partir, declaração de variavel

        do{ //falando oque o sistema vai fazer
        if(cont % 3 == 0){
        System.out.println(cont);
        }
        cont++;
        }while(cont <= 1000); //passando a condição para ele executar o comando acima
    }
}