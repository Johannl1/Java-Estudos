package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais03 {
    public static void main(String[] args) {
        //salario > 0 && salario <= 34712 = 9.70%
        //salario >= 34713 && <= 68507 = 37.35%
        //salario >= 68508 = 49.50%
        double salario = 40800;
        double taxa;
        if(salario > 0 && salario <= 34712){
            taxa = salario * 0.0970;
        }else if(salario >= 34713 && salario <= 68507){
            taxa = salario * 0.3735;
        }else{
            taxa = salario * 0.4950;
        }
        System.out.println(taxa);
    }

}
