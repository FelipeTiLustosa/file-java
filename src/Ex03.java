import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        String path = "C:\\Users\\felip\\OneDrive\\Documento\\Desinvolvimento\\temp\\ws-intellj\\file-java\\src\\in.txt";

        try(BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String line = bf.readLine();// Vai ler uma linha do arquivo, caso o arquivo esteja no final ele vai retorna null
            while (line != null) {
                System.out.println(line);
                line = bf.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
