package academy.devdojo.maratonajava.introducao;
/* MENSAGEM E "Eu <nome>, morando no endereco <endereco>
      confirmo que recebi o salario de <salario>, na data <data> */

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {

        String nome = "Johann";
        String endereco = "Giacomo Nicoletti 112";
        double salario = 2500;
        String dataRecebimento = "20/09/2022";
        String mensagemRelatorio = "Eu "+nome+", morando no endereco "+endereco+" confirmo que recebi o salario de "+salario+", na data "+dataRecebimento;
        System.out.println("Eu "+nome+", morando no endereco "+endereco+" confirmo que recebi o salario de "+salario+", na data "+dataRecebimento);
        System.out.println(mensagemRelatorio);
    }

}
