public class exercicio4 {

    private static class No {
        int conteudo;
        No anterior;

        No(int conteudo) {
            this.conteudo = conteudo;
        }
    }

    private No topo;

    public exercicio4() {
        topo = null;
    }

    public void push(int conteudo) {
        No novoConteudo = new No(conteudo);
        if (topo != null) {
            novoConteudo.anterior = topo;
        }
        topo = novoConteudo;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("A Pilha esta vazia.");
        }
        int conteudo = topo.conteudo;
        topo = topo.anterior;
        if (topo != null) {
        }
        return conteudo;
    }

    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("A Pilha esta completamente vazia.");
        }
        return topo.conteudo;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public void mostrarAPilha() {
        No atual = topo;
        while (atual != null) {
            System.out.print(atual.conteudo + ", ");
            atual = atual.anterior;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        exercicio4 pilhaFalsa = new exercicio4();
        pilhaFalsa.push(10);
        pilhaFalsa.push(20);
        pilhaFalsa.push(17);
        System.out.println("Conteudo do Topo: " + pilhaFalsa.top());
        pilhaFalsa.mostrarAPilha();
        pilhaFalsa.pop();
        pilhaFalsa.mostrarAPilha();
    }
}
