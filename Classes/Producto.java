package Classes;
/******************************************************************
Producto.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
public abstract class Producto {
    
    Vista v = new Vista();
    
    protected String name;
    protected int precio;
    protected int serie;
    protected String marca;
    protected String fabDate;
    protected int marcaAr;

    /*Constructor de clase*/
    public Producto(String name, int precio, int serie, String marca, String fabDate, int marcaAr){
        this.name = name;
        this.precio = precio;
        this.serie = serie;
        this.marca = marca;
        this.fabDate = fabDate;
        this.marcaAr = marcaAr;
    }

     /*Metodo para devolver el valor de Precio
      @return valor de Precio
      */
    public int getPrecio(){
        return precio;
    }

     /*Metodo para devolver el valor de Serie
      @return valor de Serie
      */
    public int getSerie(){
        return serie;
    }

     /*Metodo para devolver el valor de Marca
      @return valor de Marca
      */
    public String getMarca(){
        return marca;
    }

     /*Metodo para devolver el valor de Name
      @return valor de Name
      */
    public String getName(){
        return name;
    }

     /*Metodo para devolver el valor de Fabdate
      @return valor de Fabdate
      */
    public String getFabDate(){
        return fabDate;
    }

     /*Metodo para devolver el valor de MarcAr
      @return valor de MarcAr
      */
    public int getMarcaAr(){
        return marcaAr;
    }

    public abstract void execute();


}
