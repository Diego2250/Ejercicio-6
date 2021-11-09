package Classes;

import Interfaces.Callinterface;

public class cellphone extends Producto implements Callinterface{
    boolean portable = true;

    public cellphone(int precio, int serie, String marca, String fabDate, int marcaAr) {
        super(precio, serie, marca, fabDate, marcaAr);
        //TODO Auto-generated constructor stub

    }

    @Override
    public void doCall(int phone_number) {
        // TODO Auto-generated method stub
        
    }

    
}
