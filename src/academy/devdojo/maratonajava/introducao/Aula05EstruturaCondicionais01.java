package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais01 {
    public static void main(String[] args) {
        int idade = 12;
        boolean autorizadoComprarBebida = idade >= 18;
        if(autorizadoComprarBebida != false) {
            System.out.println("dentro do if");
        }else{
            System.out.println("nao autorizado");

        }
    }
}



