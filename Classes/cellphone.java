package Classes;

import Interfaces.Callinterface;

public class Cellphone extends Producto implements Callinterface{
    boolean portable = true;

    public Cellphone(int precio, int serie, String marca, String fabDate, int marcaAr) {
        super(precio, serie, marca, fabDate, marcaAr);
        //TODO Auto-generated constructor stub

    }

    @Override
    public int doCall(int phone_number) {
        return phone_number;
        
    }

    @Override
    public void execute() {
        v.calling(doCall(v.pedirNumero()));


    }

    
}
