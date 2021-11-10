package Classes;

import Interfaces.Pictureinterface;
import Interfaces.Videointerface;

/******************************************************************
Camera.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
public class Camera extends Producto implements Pictureinterface, Videointerface {
    boolean portable = true;
    
    /*Constructor de clase*/
    public Camera(String name, int precio, int serie, String marca, String fabDate, int marcaAr) {
        super(name, precio, serie, marca, fabDate, marcaAr);
        //TODO Auto-generated constructor stub
    }
    
     

       /*
    Metodo para tomar foto
    */
    @Override
    public boolean doPic() {
        // TODO Auto-generated method stub
        return true;
        
    }


/*
    Metodo para mostrar un video
    */
    @Override
    public boolean doVid() {
        return true;
    }


    @Override
    public void execute() {
        v.video(doVid());
        v.video(doVid());
        
    }
    
}
