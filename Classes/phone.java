package Classes;

import Interfaces.Callinterface;

/******************************************************************
phone.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
public class phone extends Producto implements Callinterface{
    public phone(int precio, int serie, String marca, String fabDate, int marcaAr) {
        super(precio, serie, marca, fabDate, marcaAr);
        //TODO Auto-generated constructor stub

    }

    @Override
    public int doCall(int phone_number) {
        // TODO Auto-generated method stub
        return phone_number;
    }

    
}
