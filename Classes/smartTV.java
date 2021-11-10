package Classes;

import Interfaces.Internetinterface;
import Interfaces.Videointerface;

/******************************************************************
smartTV.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
public class SmartTV extends Producto implements Internetinterface, Videointerface {
    public SmartTV(String name, int precio, int serie, String marca, String fabDate, int marcaAr) {
        super(name, precio, serie, marca, fabDate, marcaAr);
        //TODO Auto-generated constructor stub

    }
      /*
    Metodo para mostrar un video
    */
    @Override
    public boolean doVid() {
        // TODO Auto-generated method stub
        return true;
    }


    /*
    Metodo para visitar un sitio web
    @param url
    */
    @Override
    public String doInternet(String url) {
        // TODO Auto-generated method stub
        return url;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        v.Internet(doInternet(v.PedirURL()));
        v.video(doVid());


        
    }
}
