import java.util.Stack;

public class exercicio {
    public static void main(String[] args) {
        String texto = "ESTE EXERCICIO NAO E FACIL NAO.";
        texto = texto.substring(0, texto.length() - 1);

        String[] palavras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            Stack<Character> frase = new Stack<>();

            for (char c : palavra.toCharArray()) {
                frase.push(c);
            }

            while (!frase.isEmpty()) {
                resultado.append(frase.pop());
            }

            resultado.append(" ");
        }

        System.out.println(resultado.toString().trim() + ".");
    }
}
