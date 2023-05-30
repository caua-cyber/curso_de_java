/*
 * Autor:
 * Data:
 * Descrição: soma dos numeros aleatorios inteiros e do tipo double
*/

import java.util.Random;
import java.util.random.*;

public class caua_Salmaso_exer3 {
    public static void main(String[]args){
        //inicialização das variaveis e instancias 
        Random num_aleatorio = new Random();
        int cont = 1;
        int num = 0;
        double num2 = 0.0;
        int soma1 = 0;
        double soma2 = 0.0;

        //inicio
        while(cont <=50){
            num = num_aleatorio.nextInt();
            soma1 = num + soma1;
            num2 = num_aleatorio.nextDouble();
            soma2 = num2 + soma2;
            cont++;
        }
        System.out.println(soma1);
        System.out.println(soma2);
    }
}
