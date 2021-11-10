/******************************************************************
tablet.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
package Classes;

import Interfaces.Internetinterface;
import Interfaces.Pictureinterface;
import Interfaces.Videointerface;


public class Tablet extends Producto implements Pictureinterface, Internetinterface, Videointerface{
    /*Constructor de clase*/
    public Tablet(String name, int precio, int serie, String marca, String fabDate, int marcaAr) {
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

      /*
    Metodo para tomar foto
    */
    @Override
    public boolean doPic() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void execute() {
        // foto, internet, video. 
        v.Foto(doPic());
        v.Internet(doInternet(v.PedirURL()));
        v.video(doVid());
        
    }

}
