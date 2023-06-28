package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    // psvm atalho pra linha de baixo
    public static void main(String[] args) {
    // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 25;
        String nome = "e foda dog";

        System.out.println("a idade e "+age+" anos");
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(numeroGrande);
        System.out.println("e brincadeira "+nome);
    }
}
