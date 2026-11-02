import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite uma palavra:");
        String palavra = leitor.readLine();

        Inversor inversor = new Inversor();

        String arvalap = inversor.inverterPalavra(palavra);

        System.out.println("Palavra invertida: " + arvalap);
    }
}