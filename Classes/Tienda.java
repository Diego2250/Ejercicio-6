/******************************************************************
Tienda.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
package Classes;

public class Tienda {
    private int codigo; 
    private String pais, ciudad, direccion; 
        /*Constructor de clase*/
    public Tienda(String direc, int cod, String pa, String ciu) {
        direccion=direc; 
        codigo=cod;
        pais=pa;
        ciudad=ciu; 
    }    

         /*Metodo para devolver el valor de Direcci[on]
      @return valor de Direccion
      */
    public String getDireccion(){
        return direccion; 
    }

         /*Metodo para devolver el valor de Ciudad
      @return valor de Ciudad
      */
    public String getCiudad(){
        return ciudad; 
    }

         /*Metodo para devolver el valor de Pais
      @return valor de Pais
      */
    public String getPais(){
        return pais; 
    }

         /*Metodo para devolver el valor de Codigo
      @return valor de Codigo
      */
    public int getCodigo(){
        return codigo; 
    }
}
