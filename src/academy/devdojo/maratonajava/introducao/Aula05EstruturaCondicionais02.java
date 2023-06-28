package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        // salario < 1000 = Comprar frutas
        // salario >= 1000 = Comprar Frango e arroz
        // salario > 2500 = Comprar carne vermelha e arroz
        int salario = 2500;
        String compras;
        if(salario < 1000) {
            compras = "Comprar Frutas";
        }else if(salario >= 1000 && salario < 2500) {
            compras = "Comprar frango e arroz";
        }else{
            compras = "Comprar Carne vermelha e arroz";
        }
        System.out.println(compras);

    }
}

