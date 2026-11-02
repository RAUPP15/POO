import java.util.Stack;

public class Inversor {

    public String inverterPalavra(String palavra) {

        Stack<Character> pilha = new Stack<>();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }

        for (int i = 0; i < palavra.length(); i++) {
            resultado.append(pilha.pop());
        }

        return resultado.toString();
    }
}