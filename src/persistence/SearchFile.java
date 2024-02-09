package persistence;

import java.io.File;

public class SearchFile {

    public void searchFile(String location){
        File carpeta = new File(location);
        String[] listado = carpeta.list();
        if (listado == null || listado.length == 0) {
            System.out.println("No hay elementos dentro de la carpeta actual");
            return;
        }else {
        for (int i=0; i< listado.length; i++) {
            System.out.println(listado[i]);
            }
        }
    }

}