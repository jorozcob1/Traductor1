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
    String traducio="";
    public void tobeafirmacion(String palabra) throws IOException{
        
 String analizar[]=palabra.split(" "); 
 String linea;  
 String escribir="";
BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Otros\\verbos.csv"));

 if(analizar[0].equals("i"))
{
     while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[2].equals(arreglo_datos[0]))
             {
               // System.out.print("Yo "+arreglo_datos[1]+"\n");
                 JOptionPane.showMessageDialog(null, "Yo "+arreglo_datos[1]+"\n");
                //in.TxtCod2.setText("Yo "+arreglo_datos[1]+"\n");
                traducio="Yo "+arreglo_datos[1]+"\n";
                in.TxtCod3.setText(traducio);
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
             System.out.print("Tu "+arreglo_datos[2]+"\n");
             in.TxtCod3.setText("tu "+arreglo_datos[2]+"\n");
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
             System.out.print("Nosotros "+arreglo_datos[3]+"\n");
                 in.TxtCod3.setText("Nosotros "+arreglo_datos[3]+"\n");
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
             System.out.print("Ellos "+arreglo_datos[4]+"\n");
                 in.TxtCod3.setText("Ellos "+arreglo_datos[4]+"\n");
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
             System.out.print("Ella "+arreglo_datos[5]+"\n");
                 in.TxtCod3.setText("Ella "+arreglo_datos[5]+"\n");
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
             System.out.print("El "+arreglo_datos[5]+"\n");
                 in.TxtCod3.setText("El "+arreglo_datos[5]+"\n");
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
             System.out.print("Esto "+arreglo_datos[5]+"\n");
                 in.TxtCod3.setText("Esto "+arreglo_datos[5]+"\n");
             }
 }
}

}

    
//fin tobe afirmacionn
    
    
     public void tobenegacion(String palabra) throws IOException{
        
 String analizar[]=palabra.split(" "); 
 String linea;  
 String escribir="";
BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TraductorBeta\\src\\Otros\\verbos.csv"));

 if(analizar[0].equals("i"))
{
     while ((linea=reader.readLine()) !=null)
 {  
     
     String[] arreglo_datos = linea.split(";");
     
     if(analizar[3].equals(arreglo_datos[0]))
             {
                 System.out.print("Yo no "+arreglo_datos[1]+"\n");
                 in.TxtCod3.setText("Yo no "+arreglo_datos[1]+"\n");
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
             System.out.print("Tu no "+arreglo_datos[2]+"\n");
             in.TxtCod3.setText("Tu no "+arreglo_datos[2]+"\n");
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
              in.TxtCod3.setText("Nosotros no "+arreglo_datos[3]+"\n");
             System.out.print("Nosotros no "+arreglo_datos[3]+"\n");
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
                 in.TxtCod3.setText("Ellos no "+arreglo_datos[3]+"\n");
             System.out.print("Ellos no "+arreglo_datos[3]+"\n");
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
                 in.TxtCod3.setText("Ella no "+arreglo_datos[5]+"\n");
             System.out.print("Ella no "+arreglo_datos[5]+"\n");
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
                 in.TxtCod3.setText("El no "+arreglo_datos[5]+"\n");
             System.out.print("El no "+arreglo_datos[5]+"\n");
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
                 in.TxtCod3.setText("Esto no "+arreglo_datos[5]+"\n");
             System.out.print("Esto no "+arreglo_datos[5]+"\n");
             }
 }
}


 
    
}//fin tobeneagacion 
    

     public void tobepregunta(String palabra) throws IOException{
        
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
             System.out.print("¿Yo "+arreglo_datos[1]+"?\n");
                 in.TxtCod3.setText("¿Yo "+arreglo_datos[1]+"?\n");
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
                  in.TxtCod3.setText("¿Tu "+arreglo_datos[2]+"?\n");
             System.out.print("¿Tu "+arreglo_datos[2]+"?\n");
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
                  in.TxtCod3.setText("¿Nosotros "+arreglo_datos[3]+"?\n");
             System.out.print("¿Nosotros "+arreglo_datos[3]+"?\n");
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
                  in.TxtCod3.setText("¿Ellos "+arreglo_datos[4]+"?\n");
             System.out.print("¿Ellos "+arreglo_datos[4]+"?\n");
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
                  in.TxtCod3.setText("¿Ella "+arreglo_datos[5]+"?\n");
             System.out.print("¿Ella "+arreglo_datos[5]+"?\n");
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
                  in.TxtCod3.setText("¿El "+arreglo_datos[5]+"?\n");
             System.out.print("¿El "+arreglo_datos[5]+"?\n");
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
                  in.TxtCod3.setText("¿Esto "+arreglo_datos[5]+"?\n");
             System.out.print("¿Esto "+arreglo_datos[5]+"?\n");
             }
 }
}


 
    
}//fin tobepregunta 
    
    
    
public void simpleafir(String palabra) throws IOException{
        
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
             System.out.print("Yo "+arreglo_datos[1]+ " "+verbios[1]+"\n");
              in.TxtCod3.setText("Yo "+arreglo_datos[1]+ " "+verbios[1]+"\n");
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
                in.TxtCod3.setText("Tu "+arreglo_datos[2]+ " "+verbios[1]+"\n");  
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
                  in.TxtCod3.setText("Nosotros "+arreglo_datos[3]+ " "+verbios[1]+"\n");
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
             System.out.print("Ellos "+arreglo_datos[4]+ " "+verbios[1]+"\n");
                  in.TxtCod3.setText("Ellos "+arreglo_datos[4]+ " "+verbios[1]+"\n");
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
             System.out.print("Ella "+arreglo_datos[5]+ " "+verbios[1]+"\n");
                  in.TxtCod3.setText("Ella "+arreglo_datos[5]+ " "+verbios[1]+"\n");
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
             System.out.print("El "+arreglo_datos[5]+ " "+verbios[1]+"\n");
                  in.TxtCod3.setText("El "+arreglo_datos[5]+ " "+verbios[1]+"\n");
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
             System.out.print("Eso "+arreglo_datos[5]+ " "+verbios[1]+"\n");
                  in.TxtCod3.setText("Eso "+arreglo_datos[5]+ " "+verbios[1]+"\n");
             }
 }
}


 
    
}//fin tobesimpleafir
    
     
    public void simplenega(String palabra) throws IOException
    {
            
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
             System.out.print("Yo no "+arreglo_datos[1]+ " "+verbios[1]+"\n");
                  in.TxtCod3.setText("Yo no "+arreglo_datos[1]+ " "+verbios[1]+"\n");
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
             System.out.print("Tu no "+arreglo_datos[2]+ " "+verbios[1]+"\n");
                  in.TxtCod3.setText("Tu no "+arreglo_datos[2]+ " "+verbios[1]+"\n");
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
             System.out.print("Nosotros no "+arreglo_datos[3]+ " "+verbios[1]+"\n");
                  in.TxtCod3.setText("Nosotros no "+arreglo_datos[3]+ " "+verbios[1]+"\n");
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
             System.out.print("Ellos no "+arreglo_datos[4]+ " "+verbios[1]+"\n");
                  in.TxtCod3.setText("Ellos no "+arreglo_datos[4]+ " "+verbios[1]+"\n");
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
             System.out.print("Ella no "+arreglo_datos[5]+ " "+verbios[1]+"\n");
                  in.TxtCod3.setText("Ella no "+arreglo_datos[5]+ " "+verbios[1]+"\n");
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
            System.out.print("El no "+arreglo_datos[5]+ " "+verbios[1]+"\n");
                  in.TxtCod3.setText("El no "+arreglo_datos[5]+ " "+verbios[1]+"\n");
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
             System.out.print("Eso no "+arreglo_datos[5]+ " "+verbios[1]+"\n");
                  in.TxtCod3.setText("Eso no "+arreglo_datos[5]+ " "+verbios[1]+"\n");
             }
 }
}
    }
    
    public void simplepregunta(String palabra) throws IOException
    {
            
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
            System.out.print("¿Yo "+arreglo_datos[1]+ " "+verbios[1]+"?"+"\n");
                  in.TxtCod3.setText("¿Yo "+arreglo_datos[1]+ " "+verbios[1]+"?"+"\n");
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
             System.out.print("¿Tu "+arreglo_datos[2]+ " "+verbios[1]+"?"+"\n");
                 in.TxtCod3.setText("¿Tu "+arreglo_datos[2]+ " "+verbios[1]+"?"+"\n");
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
             System.out.print("¿Nosotros"+arreglo_datos[3]+ " "+verbios[1]+"?"+"\n");
                 in.TxtCod3.setText("¿Nosotros "+arreglo_datos[3]+ " "+verbios[1]+"?"+"\n");
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
             System.out.print("¿Ellos "+arreglo_datos[4]+ " "+verbios[1]+"?"+"\n");
                 in.TxtCod3.setText("¿Ellos "+arreglo_datos[4]+ " "+verbios[1]+"?"+"\n");
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
             System.out.print("¿Ella "+arreglo_datos[5]+ " "+verbios[1]+"?"+"\n");
              in.TxtCod3.setText("¿Ella "+arreglo_datos[5]+ " "+verbios[1]+"?"+"\n");
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
             System.out.print("¿El "+arreglo_datos[5]+ " "+verbios[1]+"?"+"\n");
                 in.TxtCod3.setText("¿El "+arreglo_datos[5]+ " "+verbios[1]+"?"+"\n");
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
             System.out.print("¿Eso "+arreglo_datos[5]+ " "+verbios[1]+"?"+"\n");
              in.TxtCod3.setText("¿Eso "+arreglo_datos[5]+ " "+verbios[1]+"?"+"\n");
              //TxtCod2.setText(escribir);
             }
 }
}
    }

    
}//fin clase



