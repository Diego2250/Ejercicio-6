

/******************************************************************
archivo.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 08/11/2021

Modelo de archivo para uso del Controlador.
******************************************************************/
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
public class Archivo{
Vista v = new Vista();
  public Archivo(){

  }
  /*Metodo crear un archivo de texto
  */
  public void crearchivo() {
      try {
        File myObj = new File(".txt");
        if (myObj.createNewFile()) {
            /***CAMBIAR**/
          System.out.println("Archivo creado: " + myObj.getName());
        } else {
        }
      } catch (IOException e) {
        e.printStackTrace();}
        v.error();
      }

    /*Metodo para escribir en el archivo
    */
    public void escribir(){
      try {
        FileWriter myWriter = new FileWriter("parqueo.txt", true);
        myWriter.write("");
        myWriter.close();
        /***CAMBIAR**/
        System.out.println("Se escribió correctamente la información");
      } catch (IOException e) {
        v.error();
        e.printStackTrace();
    }
      }
      /*Metodo para leer el archivo
      */
  public void leer(String archivo){
    try {
      File myObj = new File(archivo);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        /***CAMBIAR**/
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      v.error();
      e.printStackTrace();
    }
  }
}
