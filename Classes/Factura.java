/******************************************************************
Factura.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
package Classes;

import java.util.ArrayList;

public class Factura {
    private String nombreCliente, fecha; 
    private int NIT, NoFactura, Total; 
    Vista v=new Vista();
    private int total = 0;
    ArrayList<String> articulos = new ArrayList<String>();
    ArrayList<Integer> precios = new ArrayList<Integer>();

    /*Contructor de clase*/
    public Factura(String nombre, String fech, int nit){
        nombreCliente=nombre;
        fecha=fech; 
        NIT=nit; 
    }

    /*Metodo para calcular el total
    @param ArrayList<Producto> carrito
    */
    public void cuenta(ArrayList<Producto> carrito){ // esta cosa se llama ANTES DE PAGaR
        for(int i = 0; i<carrito.size(); i++){
            sumPrecio(carrito.get(i).getPrecio());
            articulos.add(carrito.get(i).getName());
            precios.add(carrito.get(i).getPrecio());
        }
    }

             /*Metodo para devolver el valor de Total
      @return valor de total
      */
    public int getTotal(){
        return total;
    }


    public void sumPrecio(int nuevo){
        this.total = total + nuevo;
    }

             /*Metodo para devolver el valor de Articulos
      @return valor de Artuculos
      */
    public ArrayList<String> getArticulos(){
        return articulos;
    }


             /*Metodo para devolver el valor de Precios
      @return valor de Precios
      */
    public ArrayList<Integer> getPrecios(){
        return precios;
    }

    


}
