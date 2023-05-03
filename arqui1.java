
/*
 * descrição: media de 3 numeros digitados
 * nome do autor: cauã
 * data:03/05/2023
*/

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class arqui1{ //classe principal
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in); // instancia declarada

        double n1 = 0.0;
        double n2 = 0.0;
        double n3 = 0.0;

        System.out.print("digite o primeiro numero:"); //imprimindo um texto
        n1 = ler.nextDouble(); //lendo e armazenando que o usuario digita, usando o metodo nexDouble 

        
        System.out.print("digite o segundo numero:");
        n2 = ler.nextDouble();



        
        System.out.print("digite o terceiro numero:");
        n3 = ler.nextDouble(); // lendo

        System.out.print("a media é "+((n1+n2+n3)/3)); // imprimindo


    }
}