package Classes;

import Interfaces.Callinterface;

/******************************************************************
phone.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
public class Phone extends Producto implements Callinterface{
    /*Constructor de clase*/
    public Phone(String name, int precio, int serie, String marca, String fabDate, int marcaAr) {
        super(name, precio, serie, marca, fabDate, marcaAr);
        //TODO Auto-generated constructor stub

    }

        /*
    Metodo para hacer una llamada
    @param Numero de telefono
    */
    @Override
    public int doCall(int phone_number) {
        return phone_number;
    }

    @Override
    public void execute() {
        // llamar. 
        v.calling(doCall(v.pedirNumero()));

        
    }

    
}
