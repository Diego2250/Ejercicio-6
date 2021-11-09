package Classes;

import Interfaces.Callinterface;
import Interfaces.Pictureinterface;

/******************************************************************
smartwatch.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
public class SmartWatch extends Producto implements Pictureinterface, Callinterface {
    public SmartWatch(int precio, int serie, String marca, String fabDate, int marcaAr) {
        super(precio, serie, marca, fabDate, marcaAr);
        //TODO Auto-generated constructor stub

    }

    @Override
    public int doCall(int phone_number) {
        // TODO Auto-generated method stub
        return phone_number;
    }

    @Override
    public boolean doPic() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void execute() {
        // foto, llamar. 
        v.calling(doCall(v.pedirNumero()));
        v.Foto(doPic());
        
    }

    
}
