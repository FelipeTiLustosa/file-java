import java.io.File;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path");
        String strPath=sc.nextLine();

        File path=new File(strPath);

        File[] folders =path.listFiles(File::isDirectory);//Vai filtra os caminhos
        System.out.println("FOLDERS");
        for (File folder : folders) {
            System.out.println(folder);
        }
        File[] files =path.listFiles(File::isFile);// Vai filtra as pastas
        System.out.println("FILES");
        for (File file : files) {
            System.out.println(file);
        }

        boolean sucess = new File(strPath + "\\subir").mkdir();// Vai criar uma pasta e retorna true caso ela seja criada
        System.out.println("Directory created successfully: "+sucess);

        sc.close();
    }
}
