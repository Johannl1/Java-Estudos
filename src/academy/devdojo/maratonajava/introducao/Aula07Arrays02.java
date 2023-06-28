package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, shor, int, long, float, double 0
        // char '\u0000'  ' '
        // boolean false
        // String null
        String[] nomes = new String[4];
        nomes[0] = "goku";
        nomes[1] = "madara";
        nomes[2] = "luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
