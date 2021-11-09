package Classes;

import Interfaces.Callinterface;
import Interfaces.Videointerface;

/******************************************************************
Camera.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
public class Camera extends Producto implements Callinterface, Videointerface {
    public Camera(String name, int precio, int serie, String marca, String fabDate, int marcaAr) {
        super(name, precio, serie, marca, fabDate, marcaAr);
        //TODO Auto-generated constructor stub
    }


    boolean portable = true;
    
    
     

    @Override
    public int doCall(int phone_number) {
        return phone_number;    
    } 


    @Override
    public boolean doVid() {
        return true;
    }


    @Override
    public void execute() {
        v.calling(doCall(v.pedirNumero()));
        v.video(doVid());
        
    }
    
}
