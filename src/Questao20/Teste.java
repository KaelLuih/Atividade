package Questao20;

public class Teste {
    static int total = 0;

    public void incrementar() {
        total++;
    }

    public static void main(String[] args) {
        Teste t1 = new Teste();
        Teste t2 = new Teste();
        t1.incrementar();
        t2.incrementar();
        System.out.println(Teste.total);
    }
}
// era imprimir o numero 2 pois sera impresso somente duas vezes pelo metodo static e entra no metodo duas vezes