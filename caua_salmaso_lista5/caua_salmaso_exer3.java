/*
* descrição: Criação de uma classe chamada "Casa" que tem 10 atributos e 5 métodos
* autor: Cauã
* data: 07/06/2023
*/ 

public class caua_salmaso_exer3 {
    public static void main(String[] args) {
        casa nova = new casa("Azul", "madeira", "Rua do Iguasu", "Ipiranga", "Manauz", "Rica", "humilde", "Jumiraldiz", 20, "0718290");
        System.out.println("------objeto-------");
        System.out.println(nova.cor);
        System.out.println(nova.material);
        System.out.println(nova.localidade);
        System.out.println(nova.bairro);
        System.out.println(nova.cidade);
        System.out.println(nova.Classe_social);
        System.out.println(nova.CEP);
        System.out.println(nova.origem);
        System.out.println(nova.Residente);
        System.out.println(nova.numero);

        System.out.println("----Métodos-----");

        nova.abrir_garagem();
        nova.abrir_janela_manual();
        nova.abrir_porta_automatica();
        nova.analisar_quantidade_pessoa();
        System.out.println(nova.numero_de_pessoas_novamente());
    }
}

class casa{
    //atributos
    String cor,material,localidade,bairro,cidade,Classe_social,origem,Residente,CEP;
    int numero;
    //Método construtor
    casa(
        String cor_digitada,
        String material_digitado,
        String localidade_digitada,
        String bairro_digitado,
        String cidade_digitada,
        String classe_social_digitada,
        String origem_digitada,
        String residente_informado,
        int numero_digitado,
        String cep_digitado
    ){
        cor = cor_digitada;
        material = material_digitado;
        localidade = localidade_digitada;
        bairro = bairro_digitado;
        cidade = cidade_digitada;
        Classe_social = classe_social_digitada;
        origem = origem_digitada;
        Residente = residente_informado;
        numero = numero_digitado;
        CEP = cep_digitado;
    }
    //Métodos
    void abrir_porta_automatica(){
        System.out.println("Abrindo porta.......");
    }

    void abrir_janela_manual(){
        System.out.println("Abrindo Janela");
    }

    void abrir_garagem(){
        System.out.println("abrindo a garagem.....");
    }

    void analisar_quantidade_pessoa(){
        System.out.println("Existe 3 pessoas no local :3");
    }

    int numero_de_pessoas_novamente(){
        return 3;
    }
}