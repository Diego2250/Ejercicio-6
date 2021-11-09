/******************************************************************
smartphone.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
public class Smartphone extends Producto {

    boolean portable = true;

    public Smartphone(int precio, int serie, String marca, String fabDate, int marcaAr) {
        super(precio, serie, marca, fabDate, marcaAr);
        //TODO Auto-generated constructor stub

    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        
    }

    public void doCall(int phone_number){
        //método de la vista para llamar. 
    }

    public void doPic(){
        //método de la vista para tomar pic. 
    }

    public void doInternet(String url){
        //método de la vista para llamar. 
    }

    public void doVid(){
        //método de la vista para llamar. 
    }
    
}
