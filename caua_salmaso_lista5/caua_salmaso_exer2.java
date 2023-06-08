/*
 * descrição:  Criação de  uma classe chamada "Cinto" que tem 5 método
 * data: 08/06/2023
 * autor: Cauã
*/

public class caua_salmaso_exer2 {

    public static void main(String[] args) {
        
        cinto acao = new cinto("nome");
        acao.cair();
        acao.solta();
        acao.subir();
        acao.arrumar_se();
        System.out.println(acao.nome_marca());
    
    }
}

class cinto{
    //atributos
    String nome;

    //metodo construtor
    cinto(String nome_digitado){
        nome = nome_digitado;
    }

    //metodo
    void cair(){
        System.out.println("vish, caiu");
    }

    void solta(){
        System.out.println("Adeus, se soltando");
    }

    void subir(){
        System.out.println("Subindo em um momento");
    }

    void arrumar_se(){
        System.out.println("Se arrumando now.....");
    }

    String nome_marca(){
        return "Cadilack";
    }
}
