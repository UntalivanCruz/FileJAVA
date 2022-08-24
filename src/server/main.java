/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package server;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Developer
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String direccionTxt="./src/server/dataBase/txtprueba.txt";
        crearTxt(direccionTxt);
        escribirTxt(direccionTxt,"Hola mundo!, esto es una prueba mas");
        //borrar
        escribirTxt(direccionTxt,"Alumno: Pedro Lopez");
        leerTxt(direccionTxt);
    }

    private static void crearTxt(String ruta){
        try{
            File newFile = new File(ruta);
            if(!newFile.exists()){
                newFile.createNewFile();
                System.out.println("Archivo creado!");
            }else{
                System.out.println("Archivo no creado, ya existe!");
            }
        }
        catch(IOException io){
            System.out.println("Error: " + io);
        }
    }  

    private static void escribirTxt(String ruta,String texto){
        try{
            FileWriter newFile =new FileWriter(ruta); 
            newFile.write(texto);
            newFile.close();
        }catch(IOException io){
            System.out.println("Error: " + io);
        }
    }

    private static void leerTxt(String ruta){
        try {
          File myObj = new File(ruta);
          Scanner myReader = new Scanner(myObj);
          while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
          }
          myReader.close();
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
    } 
}
