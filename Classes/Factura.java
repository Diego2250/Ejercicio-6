package Classes;

import java.util.ArrayList;

public class Factura {
    private String nombreCliente, fecha; 
    private int NIT, NoFactura, Total; 
    Vista v=new Vista();
    private int total = 0;
    ArrayList<String> articulos = new ArrayList<String>();
    ArrayList<Integer> precios = new ArrayList<Integer>();

    public Factura(String nombre, String fech, int nit){
        nombreCliente=nombre;
        fecha=fech; 
        NIT=nit; 
    }

    public void ImprimirFactura() {
        Vista v = new Vista();
        v.print("");
    }

    public void cuenta(ArrayList<Producto> carrito){ // esta cosa se llama ANTES DE PAGaR
        for(int i = 0; i<carrito.size(); i++){
            sumPrecio(carrito.get(i).getPrecio());
            articulos.add(carrito.get(i).getName());
            precios.add(carrito.get(i).getPrecio());
        }
    }

    public void sumPrecio(int nuevo){
        this.total = total + nuevo;
    }

    public ArrayList<String> getArticulos(){
        return articulos;
    }

    public ArrayList<Integer> getPrecios(){
        return precios;
    }

    


}
