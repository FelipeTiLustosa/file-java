import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        String[] lines = new String[]{"Good morning","Good afternoon","Good night"};
        String path = "C:\\Users\\felip\\OneDrive\\Documento\\Desinvolvimento\\temp\\ws-intellj\\file-java\\src\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){// ser eu colocar o true ele n vai criar o arquivo apenas adiciona
        for(String line : lines){
            bw.write(line); // Vai adiciona os dados no arquivo, porem tem q colocar o newLine para da o quebra de linha
            bw.newLine(); // Vai da o quebra de linha
        }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
