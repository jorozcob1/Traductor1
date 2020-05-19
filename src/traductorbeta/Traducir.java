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

/**
 *
 * @author Usuario
 */
public class Traducir {
    
    
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
             System.out.print("Yo "+arreglo_datos[1]+"\n");
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
             }
 }
}
    }
    
    
    
    
    
    
    
    
    
}//fin clase



