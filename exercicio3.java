import java.util.*;

public class exercicio3 {

    private final Queue<Stack<Integer>> filaDePilhas;

    public exercicio3() {
        filaDePilhas = new LinkedList<>();
    }

    public void addPilha(Stack<Integer> pilhaNova) {
        filaDePilhas.offer(pilhaNova);
    }

    public Stack<Integer> removePilha() {
        return filaDePilhas.poll();
    }

    public void inserirNaUltPilha(int num) {
        if (filaDePilhas.isEmpty()) {
            System.out.println("A fila está vazia.");
            return;
        }

        Stack<Integer> ultimaPilha = ((LinkedList<Stack<Integer>>) filaDePilhas).peekLast();
        ultimaPilha.push(num);
    }

    public Integer removerDaPrimPilha() {
        if (filaDePilhas.isEmpty()) return null;

        Stack<Integer> primeiraPilha = filaDePilhas.peek();
        if (primeiraPilha.isEmpty()) return null;

        return primeiraPilha.pop();
    }

    public void mostrarFilaDePilhas() {
        System.out.println("Fila de pilhas:");
        for (Stack<Integer> pilha : filaDePilhas) {
            System.out.println(pilha);
        }
    }

    public static void main(String[] args) {
        exercicio3 estrutura = new exercicio3();

        Stack<Integer> pilha1 = new Stack<>();
        pilha1.push(10);
        pilha1.push(20);

        Stack<Integer> pilha2 = new Stack<>();
        pilha2.push(30);
        pilha2.push(40);

        estrutura.addPilha(pilha1);
        estrutura.addPilha(pilha2);

        estrutura.mostrarFilaDePilhas();

        estrutura.inserirNaUltPilha(99);
        estrutura.mostrarFilaDePilhas();

        System.out.println("Foi Removido o num: " + estrutura.removerDaPrimPilha());
        estrutura.mostrarFilaDePilhas();

        estrutura.removePilha();
        estrutura.mostrarFilaDePilhas();
    }
}
