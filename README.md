# Atividade Java: Métodos `static`

Este projeto tem como objetivo exercitar o uso de métodos `static` (estáticos) em Java, demonstrando como criá-los, chamá-los e suas principais aplicações.

## Conteúdo

- O que são métodos estáticos?
- Quando utilizar métodos estáticos?
- Exemplo prático desenvolvido na atividade
- Como executar o projeto

---

## O que são métodos estáticos?

Métodos `static` em Java pertencem à classe, e não a uma instância específica. 
Isso significa que eles podem ser chamados sem precisar criar um objeto da classe.

**Exemplo básico:**
```java
public class Util {
    public static int soma(int a, int b) {
        return a + b;
    }
}
```
Para usar:
```java
int resultado = Util.soma(2, 3);
```

---

## Quando utilizar métodos estáticos?

Use métodos estáticos quando:
- A lógica do método não depende de nenhum atributo de instância (não usa `this`)
- Você quer utilitários ou funções auxiliares, como cálculos matemáticos, formatações, etc.
- Precisa acessar rapidamente uma funcionalidade sem criar objetos

---

## Exemplo da atividade

Neste projeto, criamos uma classe chamada `Calculadora` com métodos estáticos para realizar operações matemáticas simples:

```java
public class Calculadora {
    public static int somar(int a, int b) {
        return a + b;
    }
    public static int subtrair(int a, int b) {
        return a - b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero.");
        }
        return (double) a / b;
    }
}
```

E um arquivo `Main.java` para testar os métodos:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Soma: " + Calculadora.somar(10, 5));
        System.out.println("Subtração: " + Calculadora.subtrair(10, 5));
        System.out.println("Multiplicação: " + Calculadora.multiplicar(10, 5));
        System.out.println("Divisão: " + Calculadora.dividir(10, 5));
    }
}
```

---

## Como executar o projeto

1. **Clone ou baixe este repositório.**
2. **Compile os arquivos Java:**
   ```sh
   javac Calculadora.java Main.java
   ```
3. **Execute o programa:**
   ```sh
   java Main
   ```

Você verá a saída das operações matemáticas no terminal.

---

## Aprendizados

- Métodos estáticos são ideais para funções utilitárias.
- Não precisam de objetos para serem chamados.
- Facilitam a reutilização de código.

---

**Bons estudos!**
