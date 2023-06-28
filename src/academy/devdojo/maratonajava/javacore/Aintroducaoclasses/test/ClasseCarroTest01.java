package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.ClasseCarro;

public class ClasseCarroTest01 {
    public static void main(String[] args) {
        ClasseCarro carro = new ClasseCarro();
        ClasseCarro carro2 = new ClasseCarro();
        carro.modelo = "Sedan";
        carro.ano = 1993;
        carro.nome = "Peugeot";

        carro2.modelo = "Porshe";
        carro2.ano = 2019;
        carro2.nome = "Porshe Panamera";

        System.out.println("Carro 1");
        System.out.println("Modelo: " + carro.modelo + "\nAno: " + carro.ano + "\nNome: " + carro.nome + "\n");
        System.out.println("Carro 2");
        System.out.println("Modelo: " + carro2.modelo + "\nAno: " + carro2.ano + "\nNome: " + carro2.nome);

    }
}
