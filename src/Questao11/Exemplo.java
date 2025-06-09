package Questao11;

public class Exemplo {
    public  static int contador = 0; //O contdor define como 0

    public Exemplo() {
        contador++;// faz o contador vai contar 1  numero por vez para cada objeto criado
    }

    public static void main(String[] args) { //  vai criar outrea classe
        new Exemplo();// cria um objeto
        new Exemplo();// crisa outro objeto
       System.out.println(Exemplo.contador); // imprime os dois objetos ou mostra quantos foram criados
    }
}
