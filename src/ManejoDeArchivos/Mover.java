/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoDeArchivos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Usuario
 */
public class Mover {
    
    
    public  void mover(String origen,String destino) throws IOException{

        try{

            File rutaOriginalFichero = new File(origen);
            File rutaDestinoFichero = new File(destino);
            Files.move(Paths.get(rutaOriginalFichero.getAbsolutePath()), Paths.get(rutaDestinoFichero.getAbsolutePath()), StandardCopyOption.REPLACE_EXISTING);
 
        }catch(Exception e){

           System.out.println(e);

        }

    }

    
    
    
    
    
}
