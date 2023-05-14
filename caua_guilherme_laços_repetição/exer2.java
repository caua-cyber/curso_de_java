/*
 * descrição: laço de repetição for configurado pelo usuario
 * autor:cauã
 * data:13/05/2023
 */

import java.util.Scanner;

public class exer2 {

    public static void main(String[] args){

    Scanner ler = new Scanner(System.in); //instancia da classe Scanner

    System.out.println("digite o inicio:"); 
    int inicio = ler.nextInt(); //obtendo o inicio do laço

    System.out.println("digite o final:");
    int fim = ler.nextInt(); // obtendo o final do laço

    while(inicio < fim){
        
        System.out.println(inicio);
        inicio++;
    }
    }


}
