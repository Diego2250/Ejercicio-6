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

    public Producto(String name, int precio, int serie, String marca, String fabDate, int marcaAr){
        this.name = name;
        this.precio = precio;
        this.serie = serie;
        this.marca = marca;
        this.fabDate = fabDate;
        this.marcaAr = marcaAr;
    }

    public int getPrecio(){
        return precio;
    }

    public int getSerie(){
        return serie;
    }

    public String getMarca(){
        return marca;
    }

    public String getFabDate(){
        return fabDate;
    }

    public int getMarcaAr(){
        return marcaAr;
    }

    public abstract void execute();


}
