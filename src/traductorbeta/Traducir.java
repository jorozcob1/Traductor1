/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductorbeta;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Traducir {
    interfaz in=new interfaz();
   public static String traducio="", afirmati="";
   
    public void tobeafirmacion(String palabra) throws IOException{//recibe string 
    String afir="";  
    String analizar[]=palabra.split(" "); // se crea el array que separa por espacios el parametro recibido
    String linea;  
    String escribir="";
BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Otros\\verbos.csv"));//lee archibo verbos
//comparar que tipo de pronombre hay 
 if(analizar[0].equals("i"))// ejemplo: i will play 
     //seria lo mismo para los otros pronombres 
{
     while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");//separar el archivo archivo.csv
     
     if(analizar[2].equals(arreglo_datos[0]))
             {
                   traducio="Yo "+arreglo_datos[1]+"\n";
                   afirmati+=traducio;
               
             }
 }

}
 
 if(analizar[0].equals("you"))
{
        while ((linea=reader.readLine()) !=null)
       {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[2].equals(arreglo_datos[0]))
             {
             traducio="Tu "+arreglo_datos[5]+"\n";
             afirmati+=traducio;
             }
    

        }
}
 
 if(analizar[0].equals("we"))
{
        while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[2].equals(arreglo_datos[0]))
             { 
                 traducio="Nosotros "+arreglo_datos[2]+"\n";
                 afirmati+=traducio;
             }
 }
    
}
 
 if(analizar[0].equals("they"))
{

          while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[2].equals(arreglo_datos[0]))
             { 
                 traducio="Ellos "+arreglo_datos[3]+"\n";
                 afirmati+=traducio;
             }
 }
     
}

 
 if(analizar[0].equals("she"))
{

          while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[2].equals(arreglo_datos[0]))
             {
                 traducio="Ella "+arreglo_datos[4]+"\n";
                 afirmati+=traducio;
             }
 }
}
 
 
  if(analizar[0].equals("he"))
{

          while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[2].equals(arreglo_datos[0]))
             {
                 traducio="El "+arreglo_datos[4]+"\n";
                 afirmati+=traducio;
             }
 }
}

 
  if(analizar[0].equals("it"))
{

          while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[2].equals(arreglo_datos[0]))
             {
                 traducio="Esto "+arreglo_datos[4]+"\n";
                 afirmati+=traducio;
             }
 }
}

}

    
//fin tobe afirmacionn
    
    
     public void tobenegacion(String palabra) throws IOException{
        
 String analizar[]=palabra.split(" "); 
 String linea, neg;  
 String escribir="";
BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Otros\\verbos.csv"));

 if(analizar[0].equals("i"))
{
     while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[3].equals(arreglo_datos[0]))
             {
                 neg="Yo no "+arreglo_datos[1]+"\n";
                 afirmati+=neg;
                 }
 }

}
 
 if(analizar[0].equals("you"))
{
        while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[3].equals(arreglo_datos[0]))
             {
                 neg="Tu no "+arreglo_datos[5]+"\n";
                 afirmati+=neg;
             }
 }
    
}
 
 if(analizar[0].equals("we"))
{
        while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[3].equals(arreglo_datos[0]))
             {
                 neg="Nosotros no "+arreglo_datos[2]+"\n";
                 afirmati+=neg;
             }
 }
    
}
 
 if(analizar[0].equals("they"))
{

          while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[3].equals(arreglo_datos[0]))
             {
                 neg="Ellos no "+arreglo_datos[3]+"\n";
                 afirmati+=neg;
             }
 }
    
    
}

 
 if(analizar[0].equals("she"))
{

          while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[3].equals(arreglo_datos[0]))
             {
                 neg="Ella no "+arreglo_datos[4]+"\n";
                 afirmati+=neg;
             }
 }
}
 
  if(analizar[0].equals("he"))
{

          while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[3].equals(arreglo_datos[0]))
             {
                 neg="El no "+arreglo_datos[4]+"\n";
                 afirmati+=neg;
             }
 }
}

 
  if(analizar[0].equals("it"))
{

          while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[3].equals(arreglo_datos[0]))
             {
                 neg="Esto no "+arreglo_datos[4]+"\n";
                 afirmati+=neg;
             }
 }
}


 
    
}//fin tobeneagacion 
    

     public void tobepregunta(String palabra) throws IOException{
        String qu="";
 String analizar[]=palabra.split(" "); 
 String linea;  
 String escribir="";
BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Otros\\verbos.csv"));

 if(analizar[1].equals("i"))
{
     while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[2].equals(arreglo_datos[0]))
             {
                 qu="¿Yo "+arreglo_datos[1]+"?\n";
                 afirmati+=qu;
             }
 }

}
 
 if(analizar[1].equals("you"))
{
        while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[2].equals(arreglo_datos[0]))
             {
                 qu="¿Tu "+arreglo_datos[2]+"?\n";
                 afirmati+=qu;
                 
             }
 }
    

}
 
 if(analizar[1].equals("we"))
{
        while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[2].equals(arreglo_datos[0]))
             {
                 qu="¿Nosotros "+arreglo_datos[3]+"?\n";
                 afirmati+=qu;
                 
             }
 }
    
}
 
 if(analizar[1].equals("they"))
{

          while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[2].equals(arreglo_datos[0]))
             {
                 qu="¿Ellos "+arreglo_datos[4]+"?\n";
                 afirmati+=qu;
             }
 }
    
    
}
// 
 if(analizar[1].equals("she"))
{

          while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[2].equals(arreglo_datos[0]))
             {
                 qu="¿Ella "+arreglo_datos[5]+"?\n";
                 afirmati+=qu;
             }
 }
}
 
  if(analizar[1].equals("he"))
{

          while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[2].equals(arreglo_datos[0]))
             {
                 qu="¿El "+arreglo_datos[5]+"?\n";
                 afirmati+=qu;
             }
 }
}

 
  if(analizar[1].equals("it"))
{

          while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[2].equals(arreglo_datos[0]))
             {
                  
                 qu="¿Esto "+arreglo_datos[5]+"?\n";
                 afirmati+=qu;
                 
             }
 }
}


 
    
}//fin tobepregunta 
    
    
    
    public void simpleafir(String palabra) throws IOException{
  String si=""; 
 String analizar[]=palabra.split(" "); 
 
 String linea;  
 String linea2;
 String escribir="";
BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Otros\\verbos.csv"));
BufferedReader r = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Otros\\adv.csv"));
 if(analizar[0].equals("i"))
{
     while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
             {
             
              si="Yo "+arreglo_datos[1]+ " "+verbios[1]+"\n";
             afirmati+=si;
             }
 }

}
 
 if(analizar[1].equals("you"))
{
     while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
             {
             System.out.print("Tu "+arreglo_datos[2]+ " "+verbios[1]+"\n");
             si="Tu "+arreglo_datos[2]+ " "+verbios[1]+"\n";
             afirmati+=si; 
             }
 }
    

}
 
 if(analizar[1].equals("we"))
{
           while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
             {
            System.out.print("Nosotros "+arreglo_datos[3]+ " "+verbios[1]+"\n");
            si="Nosotros "+arreglo_datos[3]+ " "+verbios[1]+"\n";
            afirmati+=si;
             }
 }
    
}
 
 if(analizar[1].equals("they"))
{

             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
             {
             //System.out.print("Ellos "+arreglo_datos[4]+ " "+verbios[1]+"\n");
                 si="Ellos "+arreglo_datos[4]+ " "+verbios[1]+"\n";
                 afirmati+=si;
             }
 }
    
    
}
// 
 if(analizar[1].equals("she"))
{

            while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
             {
             //System.out.print("Ella "+arreglo_datos[5]+ " "+verbios[1]+"\n");
                  si="Ella "+arreglo_datos[5]+ " "+verbios[1]+"\n";
                  afirmati+=si;
             }
 }
}
 
  if(analizar[1].equals("he"))
{

             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
             {
             //System.out.print("El "+arreglo_datos[5]+ " "+verbios[1]+"\n");
                  si="El "+arreglo_datos[5]+ " "+verbios[1]+"\n";
                  afirmati+=si;
             }
 }
}

 
  if(analizar[1].equals("it"))
{

             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
             {
             //System.out.print("Eso "+arreglo_datos[5]+ " "+verbios[1]+"\n");
             si="Eso "+arreglo_datos[5]+ " "+verbios[1]+"\n";
             afirmati+=si;
             }
 }
}


 
    
}//fin tobesimpleafir
    
     
    public void simplenega(String palabra) throws IOException
    {
            String sn="";
 String analizar[]=palabra.split(" "); 
 
 String linea;  
 String linea2;
 String escribir="";
BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Otros\\verbos.csv"));
BufferedReader r = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Otros\\adv.csv"));
 if(analizar[0].equals("i"))
{
     while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[3].equals(arreglo_datos[0]) && analizar[4].equals(verbios[0]) )
             {
             //System.out.print("Yo no "+arreglo_datos[1]+ " "+verbios[1]+"\n");
               sn="Yo no "+arreglo_datos[1]+ " "+verbios[1]+"\n";
               afirmati+=sn;
             }
 }

}
 
 if(analizar[1].equals("you"))
{
     while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
   if(analizar[3].equals(arreglo_datos[0]) && analizar[4].equals(verbios[0]) )
             {
             //System.out.print("Tu no "+arreglo_datos[2]+ " "+verbios[1]+"\n");
                  sn="Tu no "+arreglo_datos[2]+ " "+verbios[1]+"\n";
                  afirmati+=sn;
             }
 }
    

}
 
 if(analizar[1].equals("we"))
{
           while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[3].equals(arreglo_datos[0]) && analizar[4].equals(verbios[0]) )
             {
             //System.out.print("Nosotros no "+arreglo_datos[3]+ " "+verbios[1]+"\n");
               sn="Nosotros no "+arreglo_datos[3]+ " "+verbios[1]+"\n";
               afirmati+=sn;
             }
 }
    
}
 
 if(analizar[1].equals("they"))
{

             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[3].equals(arreglo_datos[0]) && analizar[4].equals(verbios[0]) )
             {
             //System.out.print("Ellos no "+arreglo_datos[4]+ " "+verbios[1]+"\n");
             sn="Ellos no "+arreglo_datos[4]+ " "+verbios[1]+"\n";
             afirmati+=sn;
             }
 }
    
    
}
// 
 if(analizar[1].equals("she"))
{

            while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[3].equals(arreglo_datos[0]) && analizar[4].equals(verbios[0]) )
             {
            // System.out.print("Ella no "+arreglo_datos[5]+ " "+verbios[1]+"\n");
             sn="Ella no "+arreglo_datos[5]+ " "+verbios[1]+"\n";
             afirmati+=sn;
             }
 }
}
 
  if(analizar[1].equals("he"))
{

             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[3].equals(arreglo_datos[0]) && analizar[4].equals(verbios[0]) )
             {
           // System.out.print("El no "+arreglo_datos[5]+ " "+verbios[1]+"\n");
             sn="El no "+arreglo_datos[5]+ " "+verbios[1]+"\n";
             afirmati+=sn;
             }
 }
}

 
  if(analizar[1].equals("it"))
{

             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[3].equals(arreglo_datos[0]) && analizar[4].equals(verbios[0]) )
             {
             //System.out.print("Eso no "+arreglo_datos[5]+ " "+verbios[1]+"\n");
               sn="Eso no "+arreglo_datos[5]+ " "+verbios[1]+"\n";
               afirmati+=sn;
              
             }
 }
}
    }
    
    public void simplepregunta(String palabra) throws IOException
    {
     String si="";       
 String analizar[]=palabra.split(" "); 
 
 String linea;  
 String linea2;
 String escribir="";
BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Otros\\verbos.csv"));
BufferedReader r = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Otros\\adv.csv"));
 if(analizar[1].equals("i"))
{
     while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
             {
            //System.out.print("¿Yo "+arreglo_datos[1]+ " "+verbios[1]+"?"+"\n");
              si="¿Yo "+arreglo_datos[1]+ " "+verbios[1]+"?"+"\n";
              afirmati+=si;
             }
 }

}
 
 if(analizar[1].equals("you"))
{
     while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
   if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
             {
             //System.out.print("¿Tu "+arreglo_datos[2]+ " "+verbios[1]+"?"+"\n");
               si="¿Tu "+arreglo_datos[2]+ " "+verbios[1]+"?"+"\n";
               afirmati+=si;
             }
 }
    

}
 
 if(analizar[1].equals("we"))
{
           while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
             {
             //System.out.print("¿Nosotros"+arreglo_datos[3]+ " "+verbios[1]+"?"+"\n");
              si="¿Nosotros "+arreglo_datos[3]+ " "+verbios[1]+"?"+"\n";
              afirmati+=si;
             }
 }
    
}
 
 if(analizar[1].equals("they"))
{

             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
             {
             //System.out.print("¿Ellos "+arreglo_datos[4]+ " "+verbios[1]+"?"+"\n");
               si="¿Ellos "+arreglo_datos[4]+ " "+verbios[1]+"?"+"\n";
               afirmati+=si;
             }
 }
    
    
}
// 
 if(analizar[1].equals("she"))
{

            while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
             {
             //System.out.print("¿Ella "+arreglo_datos[5]+ " "+verbios[1]+"?"+"\n");
              si="¿Ella "+arreglo_datos[5]+ " "+verbios[1]+"?"+"\n";
             }
 }
}
 
  if(analizar[1].equals("he"))
{

             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
             {
             //System.out.print("¿El "+arreglo_datos[5]+ " "+verbios[1]+"?"+"\n");
               si="¿El "+arreglo_datos[5]+ " "+verbios[1]+"?"+"\n";
               afirmati+=si;
             }
 }
}

 
  if(analizar[1].equals("it"))
{

             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     String[] verbios = linea2.split(";");//adverbios de tiempo
     if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
             {
             //System.out.print("¿Eso "+arreglo_datos[5]+ " "+verbios[1]+"?"+"\n");
              si="¿Eso "+arreglo_datos[5]+ " "+verbios[1]+"?"+"\n";
              afirmati+=si;
              //TxtCod2.setText(escribir);
             }
 }
}
    }

    
}//fin clase



