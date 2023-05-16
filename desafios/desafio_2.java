import java.util.Scanner;

public class desafio_2 {
    public static void main(String[]args){

        Scanner leitor = new Scanner(System.in);
        int cont;
        double not1 = 0.0;
        double not2 = 0.0;
        double media = 0.0;
        int apro = 0;
        int repro = 0;

        for(cont = 1; cont > 0;){

            System.out.println("Digite 0 para sair ou 1 para começar:");
            cont = leitor.nextInt();

            System.out.println("Digite a sua nota:");
            not1 = leitor.nextDouble();

            System.out.println("Digite a outra nota:");
            not2 = leitor.nextDouble();

            if(not1 <=0){
                break;
            }

            media = (not1 + not2)/2;

            if(media <=5){
                System.out.println("reprovado!");
                repro++;
            }

            else if(media >5){
                System.out.println("Aprovado");
                apro++;
            }
            
        }

        System.out.println(media);
        System.out.println("o numero de aprovados foi de:"+apro);
        System.out.println("o numero de reprovados foi de:"+repro);

    }
}
