package Classes;

import Interfaces.Callinterface;
import Interfaces.Videointerface;

/******************************************************************
Camera.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
public class Camera extends Producto implements Callinterface, Videointerface {
    boolean portable = true;
    
    public Camera(int precio, int serie, String marca, String fabDate, int marcaAr) {
        super(precio, serie, marca, fabDate, marcaAr);
        //TODO Auto-generated constructor stub

    }
     

    @Override
    public void doCall(int phone_number) {
        // TODO Auto-generated method stub
        

        
    } 


    @Override
    public void doVid() {
        // TODO Auto-generated method stub
        
    }
    
}
