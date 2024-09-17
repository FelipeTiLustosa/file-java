import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        String path = "C:\\Users\\felip\\OneDrive\\Documento\\Desinvolvimento\\temp\\ws-intellj\\file-java\\src\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();// Vai ler uma linha do arquivo, caso o arquivo esteja no final ele vai retorna null
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            try {
                if (fr !=null) {
                    fr.close();
                }
                if (br !=null) {
                    br.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
