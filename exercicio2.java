import java.util.Stack;

public class exercicio2 {

    public static void organizarPilha(Stack<Integer> pilhaPrincipal) {
        Stack<Integer> pilhaSuporte = new Stack<>();

        while (!pilhaPrincipal.isEmpty()) {
            int temp = pilhaPrincipal.pop();

            while (!pilhaSuporte.isEmpty() && pilhaSuporte.peek() > temp) {
                pilhaPrincipal.push(pilhaSuporte.pop());
            }

            pilhaSuporte.push(temp);
        }

        while (!pilhaSuporte.isEmpty()) {
            pilhaPrincipal.push(pilhaSuporte.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> pilhaPrincipal = new Stack<>();
        pilhaPrincipal.push(34);
        pilhaPrincipal.push(3);
        pilhaPrincipal.push(31);
        pilhaPrincipal.push(98);
        pilhaPrincipal.push(92);
        pilhaPrincipal.push(23);

        System.out.println("Pilha Inicial: " + pilhaPrincipal);
        organizarPilha(pilhaPrincipal);
        System.out.println("Pilha em ordem: " + pilhaPrincipal);
    }
}
