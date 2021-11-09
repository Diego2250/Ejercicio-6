package Classes;

public class Tienda {
    private int codigo; 
    private String pais, ciudad, direccion; 
    public Tienda(String direc, int cod, String pa, String ciu) {
        direccion=direc; 
        codigo=cod;
        pais=pa;
        ciudad=ciu; 
    }    

    public String getDireccion(){
        return direccion; 
    }

    public String getCiudad(){
        return ciudad; 
    }

    public String getPais(){
        return pais; 
    }

    public int getCodigo(){
        return codigo; 
    }
}
