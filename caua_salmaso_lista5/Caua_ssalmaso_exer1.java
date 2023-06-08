/*
* descrição: classe alimento com 10 atributos
* data: 07/06/2023
* Autor: cauã
*/ 

public class Caua_ssalmaso_exer1 {
    public static void main(String[] args) {
        comida criar_alimento = new comida("Frutas", "banana", "Doce", "Peculiar", "normal", 06, 21, 20,10, 100);
        System.out.println(" ---- informação sobre o Alimento ---- ");
        System.out.println(criar_alimento.Grupo_alimentar);
        System.out.println(criar_alimento.aroma);
        System.out.println(criar_alimento.data_compra);
        System.out.println(criar_alimento.data_venda);
        System.out.println(criar_alimento.nome);
        System.out.println(criar_alimento.peso);
        System.out.println(criar_alimento.preco);
        System.out.println(criar_alimento.quantidade_estoque);
        System.out.println(criar_alimento.sabor);
        System.out.println(criar_alimento.textura);
    
    }
}

class comida{ //OBS por algum motivo, estava dando erro ao colocar o nome Alimento :<
    //Atributos
    String nome,Grupo_alimentar,sabor,aroma,textura;
    int preco,data_venda,data_compra,peso,quantidade_estoque;
    //Método construtor
    comida(
        String grupo_informado,
        String nome_informado,
        String sabor_informado,
        String aroma_informado,
        String textura_informado,
        int preco_informado,
        int data_venda_informado,
        int data_compra_informado,
        int peso_informado,
        int quantidade_estoque_informado
    ){
        nome = nome_informado;
        Grupo_alimentar = grupo_informado;  
        sabor = sabor_informado;
        aroma = aroma_informado;
        textura = textura_informado;
        preco = preco_informado;
        data_venda = data_venda_informado;
        data_compra = data_compra_informado;
        peso = peso_informado;
        quantidade_estoque = quantidade_estoque_informado;
    }
    //Método
    //exemplo não utilizou
}
