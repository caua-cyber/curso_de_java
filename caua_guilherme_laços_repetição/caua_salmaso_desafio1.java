public class caua_salmaso_desafio1{
    public static void main(String[]args){
        int cont = 0;
        int cont_teste = 0;

        while(cont <= 200){
            System.out.println(cont);
            if(cont_teste == 10){
                System.out.println("igual a 10");
                cont_teste = 0;
            }

            else{
                System.out.println(cont);
            }
            cont++;
            cont_teste++;
        }
    }
}