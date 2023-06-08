/*
* descrição: Criação de  uma classe chamada "Vovoh" que tem um método construtor
* data: 08/06/2023
* autor: Cauã
*/ 

public class caua_salmaso_exer4 {
    public static void main(String[] args) {
        vovoh familiar = new vovoh("Jefrey", "vovoh@gmail.com", 60, 4);
        System.out.println("--------  informação do vovh --------");
        System.out.println(familiar.nome);
        System.out.println(familiar.email);
        System.out.println(familiar.idade);
        System.out.println(familiar.senha_do_cartao);
    }
}

class vovoh{
    //atributos
    String nome,email;
    int idade,senha_do_cartao;
    //Método Construtor
    vovoh(String nome_digitado,String email_digitado, int idade_digitada, int numero_cartao_digitado){
        this.nome = nome_digitado;
        this.email = email_digitado;
        this.idade = idade_digitada;
        this.senha_do_cartao = numero_cartao_digitado;
    }
}
