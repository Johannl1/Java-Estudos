package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo
        // char, int, byte, short, enum, String
        byte dia = 20;
        switch (dia) {
            default:
                System.out.println("opcao invalida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;

        }
        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Invalido");
                break;

        }
        int acoes = 2;
        switch(acoes){
            case 1:
                System.out.println("Fazer check-in");
                break;
            case 2:
                System.out.println("Chamar servico de quarto");
                break;
            case 3:
                System.out.println("Fazer Pedido");
                break;
        }
    }
}

