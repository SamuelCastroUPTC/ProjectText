package persistence;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Text {
    public void text(String name, String cont){
    try {
            String ruta = "C:\\Users\\sala L310\\Documents\\Samuel\\"+name+".txt";
            String contenido = cont;
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
