import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        //Classe File e uma representacao abstrata do arquivo e seu caminho
    File file = new File("C:\\Users\\felip\\OneDrive\\Documento\\Desinvolvimento\\temp\\ws-intellj\\file-java\\src\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) { // E pra testa ser existe mais uma linha : hasNextLine()
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}