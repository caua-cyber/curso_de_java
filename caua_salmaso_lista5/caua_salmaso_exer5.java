/*
* descrição: Criação de uma classe qualquer que tem 11 métodos, sendo um deles o método construtor, e possui 10 atributos.
* data: 07/06/2023
* Autor: cauã
*/ 

public class caua_salmaso_exer5 {
    public static void main(String[] args) {
        ser_humano criar = new ser_humano("Lucas", "VillagerLand", "Estudante", "Fazer programa", "Silva", 22233332, 000000000, 39112022, 20, 80);

        System.out.println(" ---- objeto ---- ");
        System.out.println(criar.bairro);
        System.out.println(criar.cpf);
        System.out.println(criar.hoob);
        System.out.println(criar.idade);
        System.out.println(criar.nome);
        System.out.println(criar.numero_telefone);
        System.out.println(criar.ocupacao);
        System.out.println(criar.peso);
        System.out.println(criar.rg);
        System.out.println(criar.sobrenome);


        System.out.println("  ---- Métodos ---- ");
        criar.andar();
        criar.apoiar_se();
        criar.assistir();
        criar.chutar();
        criar.empurrar();
        criar.falar();
        criar.pensar();
        criar.piscar();
        criar.respirar();
        criar.segurar();
    }
}

class ser_humano{
    //atributos
    String nome,bairro,ocupacao,hoob,sobrenome;
    int rg,cpf,numero_telefone,idade,peso;
    //Método Construtor
    ser_humano(
        String nome_digitado,
        String bairro_digitado,
        String ocupacao_digitado,
        String hoob_digitado,
        String sobrenome_digitado,
        int rg_digitado,
        int cpf_digitado,
        int numero_telefone_digitado,
        int idade_digitado,
        int peso_digitado
    ){
        this.nome = nome_digitado;
        this.bairro = bairro_digitado;
        this.ocupacao = ocupacao_digitado;
        this.hoob = hoob_digitado;
        this.sobrenome = sobrenome_digitado;
        this.rg = rg_digitado;
        this.cpf = cpf_digitado;
        this.numero_telefone = numero_telefone_digitado;
        this.idade = idade_digitado;
        this.peso = peso_digitado;
    }
    //Métodos
    void andar(){
        System.out.println("Começando a Andar.....");
    }

    void respirar(){
        System.out.println("Respiração.....");
    }

    void pensar(){
        System.out.println("pensando");
    }

    void piscar(){
        System.out.println("piscando");
    }

    void falar(){
        System.out.println("falando");
    }

    void apoiar_se(){
        System.out.println("apoiando-se.....");
    }

    void assistir(){
        System.out.println("assistindo....");
    }

    void segurar(){
        System.out.println("segurando....");
    }

    void chutar(){
        System.out.println("chutando.....");
    } 
 
    void empurrar(){
        System.out.println("empurrando.....");
    }
}
