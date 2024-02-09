
package persistence;
import java.util.Scanner;
public class Presenter {

    public static void main(String[] args){
        FileText filetext= new FileText();
        filetext.setPath("./filel.txt");
        Text texts = new Text();
        Scanner namescanner = new Scanner(System.in);
        System.out.println("Digite el nombre del archivo");
        String name= namescanner.nextLine();
        System.out.println("Digite el contenido del archivo");
        String cont= namescanner.nextLine();
        texts.text(name,cont);
        SearchFile search = new SearchFile();
        search.searchFile("C:\\Users\\sacap\\OneDrive\\Documentos\\Samuel\\Tareas\\imagenes ia");
    }
}
