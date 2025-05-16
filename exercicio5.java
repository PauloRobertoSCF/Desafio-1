import java.util.*;

public class exercicio5 {

    public static boolean pilhasIguais(Stack<Integer> pilha1, Stack<Integer> pilha2) {
        if (pilha1.size() != pilha2.size()) return false;

        Stack<Integer> suporte1 = new Stack<>();
        Stack<Integer> suporte2 = new Stack<>();
        boolean iguais = true;

        while (!pilha1.isEmpty()) {
            int valor1 = pilha1.pop();
            int valor2 = pilha2.pop();
            if (valor1 != valor2) iguais = false;
            suporte1.push(valor1);
            suporte2.push(valor2);
        }

        while (!suporte1.isEmpty()) pilha1.push(suporte1.pop());
        while (!suporte2.isEmpty()) pilha2.push(suporte2.pop());

        return iguais;
    }

    public static String pilhaMaior(Stack<Integer> pilha1, Stack<Integer> pilha2) {
        int soma1 = soma(pilha1);
        int soma2 = soma(pilha2);
        if (soma1 > soma2) return "A pilha 1 e maior.";
        else if (soma2 > soma1) return "A pilha 2 e maior.";
        else return "As pilhas sao iguais!";
    }

    public static void estatisticas(Stack<Integer> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("A Pilha esta vazia! Seu burro :).");
            return;
        }

        Stack<Integer> suporte = new Stack<>();
        int minimo = Integer.MAX_VALUE, maximo = Integer.MIN_VALUE, soma = 0, contar = 0;

        while (!pilha.isEmpty()) {
            int valor = pilha.pop();
            soma += valor;
            contar++;
            if (valor > maximo) maximo = valor;
            if (valor < minimo) minimo = valor;
            suporte.push(valor);
        }

        while (!suporte.isEmpty()) pilha.push(suporte.pop());

        System.out.println("O Maior e: " + maximo + ", O Menor e: " + minimo + ", A Media e: " + (soma / (double) contar));
    }

    public static void copiar(Stack<Integer> origem, Stack<Integer> destino) {
        Stack<Integer> suporte = new Stack<>();
        for (int valor : origem) suporte.push(valor);
        destino.clear();
        while (!suporte.isEmpty()) destino.push(suporte.pop());
    }

    public static int contarImpares(Stack<Integer> pilha) {
        int contar = 0;
        for (int valor : pilha) {
            if (valor % 2 != 0) contar++;
        }
        return contar;
    }

    public static int contarPares(Stack<Integer> pilha) {
        int contar = 0;
        for (int valor : pilha) {
            if (valor % 2 == 0) contar++;
        }
        return contar;
    }

    private static int soma(Stack<Integer> pilha) {
        int somaSup = 0;
        for (int valor : pilha) somaSup += valor;
        return somaSup;
    }

    public static void main(String[] args) {
        Stack<Integer> pilha1 = new Stack<>();
        Stack<Integer> pilha2 = new Stack<>();

        pilha1.push(1); pilha1.push(5); pilha1.push(3);
        pilha2.push(1); pilha2.push(2); pilha2.push(3);

        System.out.println("as pilha 1 e pilha 2 sao iguais? " + pilhasIguais(pilha1, pilha2));
        System.out.println(pilhaMaior(pilha1, pilha2));

        estatisticas(pilha1);

        Stack<Integer> pilha3 = new Stack<>();
        copiar(pilha1, pilha3);
        System.out.println("pilha 3 (copia de pilha 1): " + pilha3);

        System.out.println("Num de Impares em pilha 1: " + contarImpares(pilha1));
        System.out.println("Num de Pares em pilha 1: " + contarPares(pilha1));
    }
}
