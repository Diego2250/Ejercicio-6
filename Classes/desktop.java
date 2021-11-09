package Classes;

import Interfaces.Internetinterface;
import Interfaces.Videogamesinterface;
import Interfaces.Videointerface;

/******************************************************************
desktop.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
public class Desktop extends Producto implements Internetinterface, Videointerface, Videogamesinterface{
    public Desktop(int precio, int serie, String marca, String fabDate, int marcaAr) {
        super(precio, serie, marca, fabDate, marcaAr);
        //TODO Auto-generated constructor stub

    }

    @Override
    public String doVideogames(String videogame) {
        return videogame;
        
    }

    @Override
    public boolean doVid() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String doInternet(String url) {
        return url;        
    }

    
}
