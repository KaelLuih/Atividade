package Questao15;

public class Contador {
    static int valor = 10; // define o valor como 10

    public static void main(String[] args) { // cria a main para imprimir
        Contador a = new Contador(); // Imprimir o valor definido a
        Contador b = new Contador();// Imprimir o valor definido b
        a.valor = 20; //Define o valor como 20
        System.out.println(b.valor); // Ira imprimir o 20
    }
    // ele ira imprimir o valor 20
}
