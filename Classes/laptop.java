package Classes;

import Interfaces.Internetinterface;
import Interfaces.Videogamesinterface;
import Interfaces.Videointerface;

/******************************************************************
laptop.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
public class Laptop extends Producto implements Internetinterface, Videointerface, Videogamesinterface{
    /*Constructor de clase*/
    public Laptop(String name, int precio, int serie, String marca, String fabDate, int marcaAr) {
        super(name, precio, serie, marca, fabDate, marcaAr);
        //TODO Auto-generated constructor stub

    }

    /*
    Metodo para ejecutar un videojiego
    @param Videogame
    */
    @Override
    public String doVideogames(String videogame) {
        return videogame;
    }

     /*
    Metodo para ver un video
    */
    @Override
    public boolean doVid() {
        return true;
    }

     /*
    Metodo para visitar un sitio web
    @param url
    */
    @Override
    public String doInternet(String url) {
        return url;
    }

    @Override
    public void execute() {
        // internet, video, videojuego. 
        v.Internet(doInternet(v.PedirURL()));
        v.video(doVid());
        v.Jugar(doVideogames(v.pedirJuego()));
        
    }

}
