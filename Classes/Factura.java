package Classes;

public class Factura {
    private String nombreCliente, fecha; 
    private int NIT, NoFactura, Total; 
    Vista v=new Vista(); 

    public Factura(String nombre, String fech, int nit, int factura, int tot){
        nombreCliente=nombre;
        fecha=fech; 
        NIT=nit; 
        NoFactura=factura; 
        Total=tot; 
    }

    public void ImprimirFactura() {
        
    }
}
