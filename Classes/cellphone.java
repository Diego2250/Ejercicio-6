package Classes;

import Interfaces.Callinterface;

public class Cellphone extends Producto implements Callinterface{
    boolean portable = true;

    /*Constructor de clase*/
    public Cellphone(String name, int precio, int serie, String marca, String fabDate, int marcaAr) {
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
        v.calling(doCall(v.pedirNumero()));


    }

    
}