package Classes;

import Interfaces.Callinterface;
import Interfaces.Pictureinterface;

/******************************************************************
smartwatch.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
public class SmartWatch extends Producto implements Pictureinterface, Callinterface {
    public SmartWatch(String name, int precio, int serie, String marca, String fabDate, int marcaAr) {
        super(name, precio, serie, marca, fabDate, marcaAr);
        //TODO Auto-generated constructor stub

    }
      /*
    Metodo para hacer una llamada
    @param Numero de telefono
    */
    @Override
    public int doCall(int phone_number) {
        // TODO Auto-generated method stub
        return phone_number;
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
        // foto, llamar. 
        v.calling(doCall(v.pedirNumero()));
        v.Foto(doPic());
        
    }

    
}
