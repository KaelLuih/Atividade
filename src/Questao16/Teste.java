package Questao16;

public class Teste {
    static int x = 5;

    public static void alterar() {
        x += 10;
    }

    public static void main(String[] args) {
        alterar();
        System.out.println(x);
    }
    // sera 15 a saida o x entra como valor definido 5 e quando passa no metodo static alterar acresenta 10

}
