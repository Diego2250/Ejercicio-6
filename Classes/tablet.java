package Classes;

import Interfaces.Internetinterface;
import Interfaces.Pictureinterface;
import Interfaces.Videointerface;

/******************************************************************
tablet.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
public class Tablet extends Producto implements Pictureinterface, Internetinterface, Videointerface{
    public Tablet(int precio, int serie, String marca, String fabDate, int marcaAr) {
        super(precio, serie, marca, fabDate, marcaAr);
        //TODO Auto-generated constructor stub

    }

    @Override
    public boolean doVid() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public String doInternet(String url) {
        // TODO Auto-generated method stub
        return url;
    }

    @Override
    public boolean doPic() {
        // TODO Auto-generated method stub
        return true;
    }

}
