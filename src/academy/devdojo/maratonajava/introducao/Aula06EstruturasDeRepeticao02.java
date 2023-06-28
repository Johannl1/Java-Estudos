package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    //Imprimir todos os numeros pares de 0 a 1kk
    public static void main(String[] args) {
        int numero = 0;
        while(numero < 1000){
            numero += 2;
            System.out.println(numero);
        }
        for(int i = 1;i < 1000000;i++){
            if(i % 2 == 0 ) {
                System.out.println(i);
            }
        }
    }
}
