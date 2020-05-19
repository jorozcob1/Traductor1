/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductorbeta;
import ManejoDeArchivos.Mover;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class TraductorBeta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        interfaz inte=new interfaz();
        inte.show();
        generarLexico();
        generarSintactico();
    }
    
    //metodos para genererar los analizadores lexico y sintactico
        public static void generarLexico()//genera el archivo Lexer.java indicandole la ubicacion del lex.flex
{
            File file= new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Lexico\\lex.flex");
        //jflex.Main.generate(file);
        JFlex.Main.generate(file);
}
     
 public static void generarSintactico() throws IOException, Exception{//genere la clase parser.java y sym.java, ademas las mueve a al paquete correspondiente
    String[] asintactico = {"-parser", "Sintactico", "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Sintactico\\parser.cup"};
        java_cup.Main.main(asintactico);
       // Thread.sleep(500);
       new Mover().mover("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Sintactico\\Sintactico.java", "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Clases\\Sintactico.java");
       new Mover().mover("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Sintactico\\sym.java", "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Clases\\sym.java");
       new Mover().mover("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Lexico\\Lexico.java", "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Clases\\Lexico.java");
 }
    
}
