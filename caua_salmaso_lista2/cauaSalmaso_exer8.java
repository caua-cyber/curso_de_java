/*
 * descrição: formulario de avaliação medica
 * autor:cauã
 * data:17/05/2023
 */

import java.util.Scanner;

public class cauaSalmaso_exer8{
    public static void main(String[]args){
    
        //declaração das variaveis
        int idade = 0; 
        double altura = 0.0;
        Character sexo = 'o';
        String nome = "";
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        nome = leitor.next();

        System.out.println("Digite a sua idade:");
        idade = leitor.nextInt();

        System.out.println("Digite o seu sexo m/f:");
        sexo = leitor.next().charAt(0);

        System.out.println("Digite a sua altura inteira:");
        altura = leitor.nextDouble();

        //testando para mulher

        if(idade <=18 && sexo == 'f' && altura < 1.50){
            System.out.println("voce é baixinha em");
        }

        else if(idade <=18 && sexo == 'f' && altura > 1.50){
            System.out.println("voce é alta em");
        }

        else if(idade >18 && sexo == 'f'){
            System.out.println("voce é velha em");
        }

        //testando para homem

        if(idade <=18 && sexo == 'm' && altura < 1.60){
            System.out.println("voce precisa tomar um shake");
        }

        else if(idade <=18 && sexo == 'm' && altura > 1.60){
            System.out.println("voce é normal cara");
        }

        else if(idade >18 && sexo == 'm'){
            System.out.println("voce é um idoso");
        }
        
    }
}