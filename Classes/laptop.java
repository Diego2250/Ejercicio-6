package Classes;
/******************************************************************
laptop.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
public class laptop extends Producto{
    public laptop(int precio, int serie, String marca, String fabDate, int marcaAr) {
        super(precio, serie, marca, fabDate, marcaAr);
        //TODO Auto-generated constructor stub

    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        
    }

    public void doVid(){
        //método de la vista para llamar. 
    }

    public void doVideogames(String videogame){
        //método de la vista para llamar. 
    }

    public void doInternet(String url){
        //método de la vista para llamar. 
    }
}
