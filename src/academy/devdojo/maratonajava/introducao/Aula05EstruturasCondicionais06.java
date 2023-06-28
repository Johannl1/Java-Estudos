package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprimima se e dia util ou final de semana
        // considerando 1 como domingo
        byte diaSemana = 7;
        switch(diaSemana){
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("opcao invalida");
                break;





        }
    }
}
