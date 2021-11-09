package Classes;

import Interfaces.Internetinterface;
import Interfaces.Videointerface;

/******************************************************************
smartTV.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
public class SmartTV extends Producto implements Internetinterface, Videointerface {
    public SmartTV(int precio, int serie, String marca, String fabDate, int marcaAr) {
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
}
