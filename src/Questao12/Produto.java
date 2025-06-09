package Questao12;


    public class Produto { // cria uma classe Produto construtor
        String nome; // Define o nome como uma String
        static int totalProdutos = 0; // cria um metodo int Esytatico igual zero para poder puxar

        public Produto(String nome) { // Cria um metodo construtor porem agora com parametro
            this.nome = nome; // define o nome igual a nome
            totalProdutos++; // e adiciona mais um a cada vez que for usado
        }

        public static void mostrarTotal() { // crie um metodo para imprimir
            System.out.println("Total: " + totalProdutos); // Exibe o tatal atraves de um System
        }
        public class Main { //cria uma main para exibir
            public static void main(String[] args) {
                Produto p1 = new Produto("Arroz");// adiciona um elemento na lista
                Produto p2 = new Produto("Feijão");// adiciona um outro elemento na lista
                Produto.mostrarTotal();//Mostra os objetos adicionados
            }
        }
    }

